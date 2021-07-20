package com.phoenix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		
		//request parameter
		String uname = request.getParameter("uname");
		String pass = request.getParameter("passwd");
		
		
		//print statement
		PrintWriter pw = response.getWriter();
		
		//business logic
		if (uname != null && pass != null && uname.equals("deep") && pass.equals("deep12")) {
			
			//send response to user
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			
			//forward
			rd.forward(request, response);
		}	else {
			pw.println("<h1 style='color:red;'>Please try agian</h1>");
			//send response
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			
			//include method
			rd.include(request, response);
		}
		
		//close method for output
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
