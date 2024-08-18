package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    HttpSession session = request.getSession(false);

	    if (session != null && session.getAttribute("username") != null) {
	        
	        String username = (String) session.getAttribute("username");
	        // Get the password from the request parameter
	        String password = request.getParameter("password");
	        
//	        String password1 = request.getParameter("password");
//	        session.setAttribute("password1", password);
//	        
	        String pass = (String) session.getAttribute("password");
	        String name = (String) session.getAttribute("name");

	        // Print the username and password to the response
	        response.getWriter().print("Username: " + username);
	        response.getWriter().print("\n");
	        response.getWriter().print("Password: " + password);
//	        response.getWriter().print("Password: " + password1);
	        response.getWriter().print("\n");
	        response.getWriter().print("Name: " + name);
	        response.getWriter().print("\n");
	        response.getWriter().print("Welcome!!! " + name+" Have a Good Day......");
	        response.getWriter().print("\n");
	        Date currentDate = new Date();
	        
	        PrintWriter writer = response.getWriter();
	        writer.print("Login Date and Time: " + currentDate.toString());
	        
	    } else {
	        
	        response.getWriter().print("No username found in session.");
	    }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
