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
import com.aurionpro.data.TransactionDb;
import com.aurionpro.entity.Transaction;

/**
 * Servlet implementation class ViewTransactionController
 */
@WebServlet("/ViewTransactionController")
public class ViewTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TransactionDb transactionDb = null;  

    public ViewTransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		transactionDb = new TransactionDb();
		transactionDb.connectToDb();

        List<Transaction> transactions = transactionDb.getTransactions();

        request.setAttribute("transactions", transactions);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewTransactions.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
