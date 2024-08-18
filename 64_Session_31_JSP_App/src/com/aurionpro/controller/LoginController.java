package com.aurionpro.controller; 
 
import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.Cookie; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
 
@WebServlet("/LoginController") 
public class LoginController extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
        
    /** 
     * @see HttpServlet#HttpServlet() 
     */ 
    public LoginController() { 
        super(); 
        // TODO Auto-generated constructor stub 
    } 
 
 /** 
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
  response.setContentType("text/html"); 
  String username =request.getParameter("username"); 
   
  Cookie cookie = new Cookie(username, username); 
  response.addCookie(cookie); 
  cookie.setMaxAge(250000); 
  PrintWriter writer =response.getWriter(); 
  writer.print("<form action='PasswordController'>  Password <input type='password' name='password' >"); 
  writer.print("<input type='submit' value='ok'> </form>"); 
   
 } 
 
 /** 
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
  doGet(request, response); 
 } 
 
}


//package com.aurionpro.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/LoginController")
//public class LoginController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//
//    public LoginController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//		response.setContentType("text/html");
//		String username =request.getParameter("username"); 
//		   
//		  Cookie cookie = new Cookie(username, username); 
//		  response.addCookie(cookie); 
//		  cookie.setMaxAge(250000); 
//		  PrintWriter writer =response.getWriter(); 
//		writer.print("<form action='PasswordController' method='post'>Password : <input type='text' name='password'>");
//		writer.print("<input type='submit' value='ok'></form>");
//		writer.print(username);
//	}
//
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
