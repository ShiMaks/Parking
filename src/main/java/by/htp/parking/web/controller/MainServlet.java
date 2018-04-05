package by.htp.parking.web.controller;

import static by.htp.parking.web.controller.util.ActionManager.determineAction;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.parking.web.controller.action.ChooseAction;


/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    	ChooseAction action = determineAction(request.getParameter("command"));
		String page;
		try {
			page = action.chooseAction(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		ChooseAction action = determineAction(request.getParameter("command"));
		String page;
		try {
			page = action.chooseAction(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

//	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
//		ChooseAction action = determineAction(request.getParameter("action"));
//		String page;
//		try {
//			page = action.chooseAction(request);
//			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
//			dispatcher.forward(request, response);
//		} catch (ServletException | IOException e) {
//			e.printStackTrace();
//		}
//	}

}
