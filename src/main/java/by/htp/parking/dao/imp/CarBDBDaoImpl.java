package by.htp.parking.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.parking.dao.BaseDao;
import by.htp.parking.dao.DaoException;
import by.htp.parking.domain.Car;

public class CarBDBDaoImpl extends AbstractDao implements BaseDao<Car>{
	
	@Override
	public void creat(Car car) throws DaoException {
		try (Connection connection = connect.getConnection(); PreparedStatement statement = connection.prepareStatement("insert into car(BrandName, Model, FuelConsumption, VolumeOfTank) values (?, ?, ?, ?)");){
			statement.setString(1, car.getBrandName());
			statement.setString(2, car.getModel());
			statement.setDouble(3, car.getFuelConsumption());
			statement.setInt(3, car.getVolueOfTank());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e);
		}	
	}

	@Override
	public Car read(int id) throws DaoException {
		
		Car car = new Car();
		
		try (Connection connection = connect.getConnection(); PreparedStatement statement = connection.prepareStatement("select ID, BrandName, Model, FuelConsumption, VolumeOfTank from car where id = ?");
			ResultSet resultSet = statement.executeQuery();){
			
			statement.setInt(1, id);
			
			if(resultSet.next()) {
				car.setId(resultSet.getInt("ID"));
				car.setBrandName(resultSet.getString("BrandName"));
				car.setModel(resultSet.getString("Model"));
				car.setFuelConsumption(resultSet.getDouble("FuelConsumption"));
				car.setVolueOfTank(resultSet.getInt("VolumeOfTank"));
				
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}	
		return car;
	}

	@Override
	public void update(Car car) throws DaoException {
		
		try (Connection connection = connect.getConnection(); PreparedStatement statement = connection.prepareStatement("");){
			
			statement.setString(1, car.getBrandName());
			statement.setString(2, car.getModel());
			statement.setDouble(3, car.getFuelConsumption());
			statement.setInt(3, car.getVolueOfTank());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e);
		}	
	}

	@Override
	public void delete(int id) throws DaoException {
		try (Connection connection = connect.getConnection(); PreparedStatement statement = connection.prepareStatement("delete from car where id = ?");) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e);
		}	
	}

	@Override
	public List<Car> readAll() throws DaoException {
		List<Car> cars = new ArrayList<>();
		ResultSet resultSet = null;
		
		try (Connection connection = connect.getConnection();Statement statement = connection.createStatement();) {
			
			
			resultSet = statement.executeQuery("select ID, BrandName, Model, FuelConsumption, VolumeOfTank from car");			
			while(resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt("ID"));
				car.setBrandName(resultSet.getString("BrandName"));
				car.setModel(resultSet.getString("Model"));
				car.setFuelConsumption(resultSet.getDouble("FuelConsumption"));
				car.setVolueOfTank(resultSet.getInt("VolumeOfTank"));
				cars.add(car);
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return cars;
	}
}
