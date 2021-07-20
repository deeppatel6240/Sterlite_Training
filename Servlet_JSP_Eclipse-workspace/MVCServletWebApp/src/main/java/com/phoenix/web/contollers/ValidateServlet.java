package com.phoenix.web.contollers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.web.models.LoginBean;

/**
 * Servlet implementation class ValidateServlet
 * @author deepkumar.sherathiya@stltech.in
 * @version 1.0
 * Date : 27/06/2021
 * copyright : Sterlite Technologies Ltd.
 */
@WebServlet("/ValidateS")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		//retrieve request parameter
		String uname = request.getParameter("username");
		String password = request.getParameter("passwd");
		
		//Java Bean Object
		LoginBean lgn = new LoginBean();
		request.setAttribute("Lgn", lgn);
		lgn.setUsername(uname);
		lgn.setPassword(password);
		
		//print output stream
		PrintWriter out = response.getWriter();
		
		//business logic
		if (lgn.isValid()) {
			//dispatching request to next servlet
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		} else {
			// send error msg to user 
			out.println("<h2 style= 'color:yellow;'>Invalid login</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
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
