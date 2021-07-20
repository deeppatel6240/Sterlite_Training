package com.phoenix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 * @author deepkumar.sherathiya@stltech.in
 * @version 1.0
 * Date : 23/06/2021
 * copyright : Sterlite Technologies Ltd.
 */
@WebServlet("/LoginS")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("passwd");
		
		//System.out.println(name);
		
		PrintWriter out = response.getWriter();	
		
		if (name != null && pass != null && name.equals("deep") && pass.equals("1234")) {
			out.println("<h1>you have sucessfully been logged in.</h1>");
		} else {
			out.println("<h1 style='color:red;'>Please try again. </h1>");
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//end of the class
