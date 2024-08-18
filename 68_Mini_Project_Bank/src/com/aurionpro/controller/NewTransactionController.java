package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.TransactionDb;

@WebServlet("/NewTransactionController")
public class NewTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewTransactionController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve the HTTP session
		HttpSession session = request.getSession(false);

		if (session != null) {
			// Fetch the customer ID from the session
			int customerID = (int) session.getAttribute("customerID");

			if (customerID != 0) {
				// Get transaction details from the request
				String transactionType = request.getParameter("transactionType");
				int amount = Integer.parseInt(request.getParameter("amount"));
				String toAccountNumber = request.getParameter("toAccountNumber"); // Only relevant for transfer

				TransactionDb transactionsDb = new TransactionDb();
				transactionsDb.connectToDb();

				boolean success = false;

				if ("credit".equals(transactionType)) {
					success = transactionsDb.credit(customerID, amount);
				} else if ("debit".equals(transactionType)) {
					success = transactionsDb.debit(customerID, amount);
				} else if ("transfer".equals(transactionType) && toAccountNumber != null) {
					success = transactionsDb.transfer(customerID, toAccountNumber, amount);
				}

				transactionsDb.closeConnection();

	            // Set the status attribute for the JSP page
	            request.setAttribute("transactionStatus", success ? "success" : "failure");

	            // Forward to the JSP page
	            RequestDispatcher dispatcher = request.getRequestDispatcher("NewTransaction.jsp");
	            dispatcher.forward(request, response);

			} else {
				// Redirect to an error page or login page if customerID is not found
				response.sendRedirect("Error.jsp");
			}
		} else {
			// Redirect to the login page if no session exists
			response.sendRedirect("error2.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Delegate to doGet for handling POST requests
		doGet(request, response);
	}
}
