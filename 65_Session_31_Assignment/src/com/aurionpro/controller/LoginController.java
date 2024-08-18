package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  // TODO Auto-generated method stub 
		  response.setContentType("text/html"); 
		  
		  // Get the username parameter from the request
		  String username = request.getParameter("username"); 
		  String name = request.getParameter("name"); 
		  
		  // Create or retrieve the existing session
		  HttpSession session = request.getSession();
		  
		  // Store the username in the session
		  session.setAttribute("username", username);
		  session.setAttribute("name", name);
		  
		  
		  // Get the PrintWriter to write the response
		  PrintWriter writer = response.getWriter();
		  
		  // Write the form to the response
		  writer.print("<form action='PasswordController' method='post'> Password <input type='password' name='password' >"); 
		  writer.print("<input type='submit' value='ok'> </form>"); 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
