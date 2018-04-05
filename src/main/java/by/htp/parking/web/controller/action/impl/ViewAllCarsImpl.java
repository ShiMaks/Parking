package by.htp.parking.web.controller.action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.htp.parking.domain.Car;
import by.htp.parking.service.CarService;
import by.htp.parking.service.ServiceException;
import by.htp.parking.service.impl.CarServiceImpl;
import by.htp.parking.web.controller.action.ChooseAction;

public class ViewAllCarsImpl implements ChooseAction {
	
	private CarService serviceCar = new CarServiceImpl();

	@Override
	public String chooseAction(HttpServletRequest request) {
		List<Car> cars;
		
		try {
			cars = serviceCar.getCars();
			request.setAttribute("listCars", cars);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return "admin.jsp";
	}

}
