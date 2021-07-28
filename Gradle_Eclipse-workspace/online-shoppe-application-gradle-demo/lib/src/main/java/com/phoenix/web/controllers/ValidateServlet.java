package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserNotFoundException;
import com.phoenix.web.models.LoginBean;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/LoginS")
public class ValidateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ValidateServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// setting up the content type
		response.setContentType("text/html");

		// Parameters
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");

		// Creating the model
		LoginBean lgb = new LoginBean();
		request.setAttribute("ob", lgb);

		// setting parameters
		lgb.setUsername(username);
		lgb.setPassword(password);

		// print writer
		PrintWriter out = response.getWriter();

		// validation of logic
		try {
			if (lgb.isValid()) {

				// sending to next servlet
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			} else {
				// error
				out.println("<h3 style='color:red; text-align:center; font-family: \"Lucida Console\", \"Courier New\", monospace;'>Invalid Login</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
