package com.example.jeep.s05;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s05/ex/mood")

public class Excercise extends HttpServlet {
	private static final Logger log = LogManager.getLogger(Excercise.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("user");
		log.trace("Name is {" + name + "}");
		String mood = req.getParameter("mood");
		log.trace(name + " is feeling {" + mood + "}");

		if (name != null) {
			req.setAttribute("name", name);
			req.getRequestDispatcher("mood.jsp").forward(req, resp);

		}

	}

}
