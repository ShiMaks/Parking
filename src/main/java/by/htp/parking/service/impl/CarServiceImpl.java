package by.htp.parking.service.impl;

import java.util.List;

import by.htp.parking.dao.BaseDao;
import by.htp.parking.dao.DaoException;
import by.htp.parking.dao.imp.CarBDBDaoImpl;
import by.htp.parking.domain.Car;
import by.htp.parking.service.CarService;
import by.htp.parking.service.ServiceException;

public class CarServiceImpl implements CarService {
	
	private BaseDao carDao = new CarBDBDaoImpl();

	@Override
	public List<Car> getCars() throws ServiceException {
		List<Car> cars;
		try {
			cars = carDao.readAll();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return cars;
	}

	@Override
	public void createCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readCar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCar(int id) throws ServiceException {
		
		try {
			carDao.delete(id);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		
	}

}
