package com.phoenix.web.products;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 * @author deepkumar.sherathiya@stltech.in
 * @version 1.0
 * Date : 23/06/2021
 * copyright : Sterlite Technologies Ltd.
 */
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//print writer
		PrintWriter out = response.getWriter();
				
		// get Httpsession object
		HttpSession session = request.getSession(false);
		
		//business logic
		if (session != null) {
			//print session id on server console
			System.out.println("Session id is from ProductServlet: " + session.getId() + "\n");
			
			String userName = (String) session.getAttribute("user");
			
			out.println("<h1>hello " + userName + ", expolore the dynamic app of session tracking</h1>");
		} else {
			out.println("<h1>Session is terminated</h1>");
		}
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
