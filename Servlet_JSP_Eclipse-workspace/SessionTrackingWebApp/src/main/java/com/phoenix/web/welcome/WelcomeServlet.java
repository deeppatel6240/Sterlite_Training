package com.phoenix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 * @author deepkumar.sherathiya@stltech.in
 * @version 1.0
 * Date : 23/06/2021
 * copyright : Sterlite Technologies Ltd.
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Get HttpSession object using request
		HttpSession session = request.getSession();
		
		//set session time out
		session.setMaxInactiveInterval(5);
		
		//print session id on server console
		System.out.println("Session id is from WelcomeServlet: " + session.getId() + "\n");
		
		// retrieve request parameter information of user name
		String name = request.getParameter("uname");
		
		session.setAttribute("user", name);
		
		//encode URL rewriting 
		String enProUrl = response.encodeURL("products");
		System.out.println("encoded url : " + enProUrl + "\n");
		
		// print stream
		PrintWriter pw = response.getWriter();
		
		pw.println("<body>" +
					"<h2> hey " + name + ", welcome to my session tracking dynamic app </h2>" +
					"<h3> session time out is : " + session.getMaxInactiveInterval() + "</h3>" +
					"<h3> for shopping <a href = '"+enProUrl+"'>Click here</a></h3>" +
					"</body>");
		
		//response.sendRedirect("http://www.google.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
// end of the class
