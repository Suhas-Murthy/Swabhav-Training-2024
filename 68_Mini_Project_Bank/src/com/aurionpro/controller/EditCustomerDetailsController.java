package com.aurionpro.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.CustomerDb;

/**
 * Servlet implementation class EditCustomerDetails
 */
@WebServlet("/EditCustomerDetailsController")
public class EditCustomerDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCustomerDetailsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CustomerDb customerDb = new CustomerDb();
		customerDb.connectToDb();
		int customerID = (int) request.getSession().getAttribute("customerID");
		String customerFirstName = request.getParameter("customerFirstName");
		String customerLastName = request.getParameter("customerLastName");
		String newPassword = request.getParameter("newPassword");
		String password = request.getParameter("password");

		try {
			// Fetch the current password from the database
			String storedPassword = customerDb.getPasswordByCustomerId(customerID);

			if (storedPassword.equals(password)) {
				// Proceed with the update if the current password is correct
				if (customerFirstName != null && !customerFirstName.isEmpty()) {
					customerDb.updateFirstName(customerID, customerFirstName);
				}
				if (customerLastName != null && !customerLastName.isEmpty()) {
					customerDb.updateLastName(customerID, customerLastName);
				}
				if (newPassword != null && !newPassword.isEmpty()) {
					customerDb.updatePassword(customerID, newPassword);
				}

				// Redirect or inform the user that the update was successful
				response.sendRedirect("profileUpdated.jsp");

			} else {
				// If the current password is incorrect, show an error message
				request.setAttribute("errorMessage", "Incorrect current password.");
				RequestDispatcher rd = request.getRequestDispatcher("editProfile.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("errorPage.jsp");
		}
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
