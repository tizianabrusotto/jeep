package com.example.jeep.s03;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s03/radice")
public class Radice extends HttpServlet {
	 private static final Logger log = LogManager.getLogger(Radice.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number = request.getParameter("number");
		log.trace("Parameter user is '{}'", number);
		
		
		if(number != null) {
			double result = Math.sqrt(Double.parseDouble(number));
		
		request.setAttribute("result", result);
		
		}
		request.getRequestDispatcher("radice.jsp").forward(request, response);
	}

}
