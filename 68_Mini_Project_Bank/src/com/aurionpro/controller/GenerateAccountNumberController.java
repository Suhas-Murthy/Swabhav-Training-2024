package com.aurionpro.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.AccountDb;
import com.aurionpro.data.CustomerDb;


@WebServlet("/GenerateAccountNumberController")
public class GenerateAccountNumberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = null;

    public GenerateAccountNumberController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String customerID = request.getParameter("customerID");
		HttpSession session = request.getSession();
		int customerID =  (int) session.getAttribute("customerID");
		System.out.println(customerID);
		AccountDb accountDb = new AccountDb();
		accountDb.connectToDb();
		
		int accountNumber = accountDb.generateAccountNumber();
		try {
			accountDb.addNewAccount(accountNumber, customerID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data added successfully");
	    RequestDispatcher rd = request.getRequestDispatcher("AdminPortal.jsp");
	    rd.forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
