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
 * Servlet implementation class AddProducts
 */
@WebServlet("/AddProducts")
public class AddProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		// Retrieve request parameter Info
		String name = request.getParameter("name");
		String brand = request.getParameter("brand");
		float price = Float.parseFloat(request.getParameter("price"));
		
		PrintWriter out = response.getWriter();
		
		Product product = new Product();
		
		try {
			ProductService productService = new ProductServiceImpl();
			List<Product> products = productService.findAll();
			HttpSession session = request.getSession(false);
			
			Product maxId = products.stream().max((p1,p2) -> p1.getId() > p2.getId() ? 1 : -1).get();
			int idNb = maxId.getId();
			product.setId(idNb+1);
			product.setName(name);
			product.setBrand(brand);
			product.setPrice(price);
			
			
			if(session != null) {
				productService.add(product);
				session.setAttribute("products", products);
			}
			
			out.println("<h3 style='color:green; text-align:center;'> Product Added Successfully! </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("products.jsp");
			rd.include(request, response);
			// response.sendRedirect("products.jsp");
			
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
