package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.CustomerDb;
import com.aurionpro.entity.Customer;

/**
 * Servlet implementation class AddBankAccountDisplayNoAccountDetails
 */
@WebServlet("/AddBankAccountDisplayNoAccountDetails")
public class AddBankAccountDisplayNoAccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBankAccountDisplayNoAccountDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerDb = new CustomerDb();
	    customerDb.connectToDb();
        List<Customer> customers = customerDb.getCustomersWithNoAccount();
        System.out.println("Number of customers fetched: " + customers.size());

        request.setAttribute("customers", customers);
        RequestDispatcher rd = request.getRequestDispatcher("AddBankAccount.jsp");
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
