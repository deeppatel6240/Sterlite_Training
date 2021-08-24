/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.web.exceptions.UserNotFoundException;
import com.phoenix.web.models.LoginBean;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/login")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		
		// Retrieve request parameter Info
		String uname = request.getParameter("uname");
		String password = request.getParameter("passwd");
		
		// Store instance
		LoginBean lb = new LoginBean();
		request.setAttribute("ob", lb);
		
		// Set Properties of LoginBean
		lb.setUsername(uname);
		lb.setPassword(password);
		
		PrintWriter out = response.getWriter();
		
		// Logic
		
		try {
			if(lb.isValid()) {
				
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
				
			}
			else {
				
				out.println("<h3 style='color:red; text-align:center;'> Invalid Login! Plz Try Again!! </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
				
			}
		} catch (UserNotFoundException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
