package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.UserDbUtil;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UserDbUtil userDbUtil = null;

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
//		request.setAttribute("password", password);
		
		userDbUtil= new UserDbUtil();
		userDbUtil.connectToDb();		
		if(userDbUtil.validateCredentials(username, password)) {
		request.setAttribute("username", username);
			dispatcher= request.getRequestDispatcher("/LoginSuccess.jsp");
		}else
			dispatcher= request.getRequestDispatcher("/LoginFailed.jsp");
		
		dispatcher.forward(request, response);
			
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
