package by.htp.parking.service;

import java.util.List;

import by.htp.parking.domain.Car;

public interface CarService {
	
	List<Car> getCars() throws ServiceException;
	
	void createCar(Car car) throws ServiceException;
	
	void readCar(int id) throws ServiceException;
	
	void updateCar(Car car) throws ServiceException;
	
	void deleteCar(int id) throws ServiceException;

}
