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

@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerDb customerDb = new CustomerDb();

    public ViewCustomerController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get search parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String customerID = request.getParameter("customerID");

        // Initialize the connection
        customerDb.connectToDb();

        // Retrieve filtered or all customers
        List<Customer> customers = customerDb.getFilteredCustomers(firstName, lastName, customerID);

        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewCustomers.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}



//old code without filters

//package com.aurionpro.controller;
//
//import java.io.IOException;
//import java.sql.ResultSet;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.aurionpro.data.CustomerDb;
//import com.aurionpro.entity.Customer;
//
//
//@WebServlet("/ViewCustomerController")
//public class ViewCustomerController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private CustomerDb customerDb = null;
//
//    public ViewCustomerController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		customerDb = new CustomerDb();
//        customerDb.connectToDb();
//
//        List<Customer> customers = customerDb.getCustomers();
//        System.out.println("Number of customers fetched: " + customers.size());
//
//        request.setAttribute("customers", customers);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewCustomers.jsp");
//        dispatcher.forward(request, response);
//		
//	}
//
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
