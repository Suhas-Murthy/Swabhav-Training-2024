package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String[] selectedColors = request.getParameterValues("options");
		writer.print("<h2>Fruits selected :</h2> <br>");
		for(String color:selectedColors) {
			writer.print("<li>"+color+"</li>");
		}
		
//	    int number1 = Integer.parseInt(request.getParameter("number1"));
//	    int number2 = Integer.parseInt(request.getParameter("number2"));
//	    int result = number1 + number2;
//	    
//	    writer.print("Addition of "+number1+" and "+number2+" is <b>"+result+"</b>");
//		writer.print("<b>Welcome to Web World!!!!!!!!.......Good Afternoon</b>");
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
