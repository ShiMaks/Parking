package by.htp.parking.web.controller.util;

import by.htp.parking.web.controller.action.ChooseAction;
import by.htp.parking.web.controller.action.impl.DeleteCarImpl;
import by.htp.parking.web.controller.action.impl.ViewAllCarsImpl;

public class ActionManager {
	
	private ActionManager() {
		
	}
	
	public static ChooseAction determineAction(String action) {
		ChooseAction act = null;
		
		switch (action){
			case "viewListCars":
				act = new ViewAllCarsImpl();
				break;
			case "deleteCar":
				act = new DeleteCarImpl();
				break;
//			default:
//				act = ;		
		}
		return act;
	}

}
