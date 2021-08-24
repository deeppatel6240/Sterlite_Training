package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phoenix.data.Product;
import com.phoenix.services.ProductService;
import com.phoenix.services.ProductServiceImpl;
import com.phoenix.web.exceptions.ProductNotFoundException;

/**
 * Servlet implementation class FindProductById
 */
@WebServlet("/FindProductById")
public class FindProductById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		boolean flag = false;
		
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		PrintWriter out = response.getWriter();
		
		try {
			ProductService productService = new ProductServiceImpl();
			Product products = productService.findProductById(id);
//			List<Product> product = (List<Product>) products;
			List<Product> product = Arrays.asList(products);
			HttpSession session = request.getSession(false);
			
			if(session != null)		{
				
				flag = true;
				session.setAttribute("products", product);
				response.sendRedirect("products.jsp");
	
			}			
			
			if(flag == false || product.isEmpty()) {
				
				out.println("<h3 style='color:red; text-align:center;'> Product Not Found!! </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("FindProductById.html");
				rd.include(request, response);
				
			}
			
		} catch (ProductNotFoundException e) {
			out.println("<h3 style='color:red; text-align:center;'> Product Not Found!! </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("FindProductById.html");
			rd.include(request, response);
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
