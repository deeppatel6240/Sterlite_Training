package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.phoenix.web.exceptions.ServiceException;

/**
 * Servlet implementation class FindProductByBrand
 */
@WebServlet("/FindProductByBrand")
public class FindProductByBrand extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		boolean flag = false;
		
		response.setContentType("text/html");
		
		String brand = request.getParameter("brand");
		
		PrintWriter out = response.getWriter();
		
		try {
			ProductService productService = new ProductServiceImpl();
			List<Product> products = productService.findByBrand(brand);
			HttpSession session = request.getSession(false);
			
			if(session != null && !products.isEmpty())		{
				
				session.setAttribute("products", products);
				response.sendRedirect("products.jsp");
				flag = true;
				
			}			
			
			if(flag == false ) {
				
				out.println("<h3 style='color:red; text-align:center;'> Product Not Found!! </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("FindProductByName.html");
				rd.include(request, response);
				
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
