package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()     */
    public PasswordController() {       
    	super();
    }
        // TODO Auto-generated constructor stub    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // TODO Auto-generated method stub

		Cookie cookies[] = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ".." + cookie.getValue());
		}
		String username = cookies[0].getValue();
		String password = request.getParameter("password");
		response.getWriter().print("Username: " + username);
		response.getWriter().print("Password: " + password);
	}

	/**
	 * * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub doGet(request, response);
	}
}