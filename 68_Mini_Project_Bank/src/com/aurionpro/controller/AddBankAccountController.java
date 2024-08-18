package com.aurionpro.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.CustomerDb;
import com.aurionpro.entity.Customer;


@WebServlet("/AddBankAccountController")
public class AddBankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = null;

	public AddBankAccountController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		customerDb = new CustomerDb();
	    customerDb.connectToDb();
        List<Customer> customers = customerDb.getCustomersWithNoAccount();
        System.out.println("Number of customers fetched: " + customers.size());

        request.setAttribute("customers", customers);

	    int customerID = Integer.parseInt(request.getParameter("customerID"));
	    System.out.println("Searching for customerID: " + customerID);
	    

        
	    HttpSession session = request.getSession();
	    session.setAttribute("customerID", customerID);
	    
	    ResultSet rs = customerDb.searchCustomerById(customerID);
	    
	    if (rs != null) {
	        try {
	            if (rs.next()) {
	                request.setAttribute("customerID", rs.getInt("customerID"));
	                request.setAttribute("customerFirstName", rs.getString("customerFirstName"));
	                request.setAttribute("customerLastName", rs.getString("customerLastName"));
	                request.setAttribute("username", rs.getString("username"));
	            } else {
	                System.out.println("No customer found with ID: " + customerID);
	                request.setAttribute("customerID", null);
	                request.setAttribute("customerFirstName", null);
	                request.setAttribute("customerLastName", null);
	                request.setAttribute("username", null);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } else {
	        System.out.println("ResultSet is null");
	    }

	    RequestDispatcher rd = request.getRequestDispatcher("AddBankAccount.jsp");
	    rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
