package com.phoenix.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phoenix.data.Product;
import com.phoenix.services.ProductService;
import com.phoenix.services.ProductServiceImpl;
import com.phoenix.web.exceptions.ServiceException;

/**
 * Servlet implementation class ProductSortServlet
 */
@WebServlet("/ProductSortServlet")
public class ProductSortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try {
			ProductService productService = new ProductServiceImpl();
			List<Product> products = productService.sortByPrice();
			HttpSession session = request.getSession(false);
			if(session != null)
				session.setAttribute("products", products);
			response.sendRedirect("products.jsp");
			
		} catch (ServiceException e) {
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
