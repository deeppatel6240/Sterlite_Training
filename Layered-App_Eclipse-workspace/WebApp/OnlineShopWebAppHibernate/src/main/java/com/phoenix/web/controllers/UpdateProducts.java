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
 * Servlet implementation class UpdateProducts
 */
@WebServlet("/UpdateProducts")
public class UpdateProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		boolean flag = false;
		
		// Retrieve request parameter Info
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String brand = request.getParameter("brand");
		float price = Float.parseFloat(request.getParameter("price"));
		
		PrintWriter out = response.getWriter();
		
		try {
			ProductService productService = new ProductServiceImpl();
			List<Product> products = productService.findAll();
			HttpSession session = request.getSession(false);
			
			for(Product product: products) {
				
				if(product.getId()==id) {
					
					product.setName(name);
					product.setBrand(brand);
					product.setPrice(price);
					
					if(session != null) {
						productService.edit(product);
						session.setAttribute("products", products);
						flag = true;
					}
					out.println("<h3 style='color:green; text-align:center;'> Product Updated Successfully! </h3>");
					RequestDispatcher rd = request.getRequestDispatcher("products.jsp");
					rd.include(request, response);
					// response.sendRedirect("products.jsp");
					
				}
			
			}
			
			if(flag == false) {
				
				out.println("<h3 style='color:red; text-align:center;'> Invalid Product Id! Plz Check the Product Id!! </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("products.jsp");
				rd.include(request, response);
				
			}
			
			
			
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
