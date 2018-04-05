package by.htp.parking.web.controller.action.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.parking.service.CarService;
import by.htp.parking.service.ServiceException;
import by.htp.parking.service.impl.CarServiceImpl;
import by.htp.parking.web.controller.action.ChooseAction;

public class DeleteCarImpl implements ChooseAction{
	
	private CarService serviceCar = new CarServiceImpl(); 

	@Override
	public String chooseAction(HttpServletRequest request) {
		
		int carId = Integer.parseInt(request.getParameter("car_id"));
		
		try {
			serviceCar.deleteCar(carId);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return "admin.jsp";
	}

}
