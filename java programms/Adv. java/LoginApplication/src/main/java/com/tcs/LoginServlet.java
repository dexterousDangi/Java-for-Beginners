package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// general setting , what type of response we are sending to the client
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		// get all the details present in request object using getParameter() method.
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// request processing logic
//		if (username.equalsIgnoreCase("pardeep") && password.equals("dangi")) {
//			writer.println("login successful..." + username);
//		} else {
//			writer.println("Login fails... try with correct credential");
//		}

		if (username.equalsIgnoreCase("pardeep") && password.equals("dangi")) {
			response.sendRedirect("http://www.google.com");
		} else {
			response.sendError(420, "login failed....");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
