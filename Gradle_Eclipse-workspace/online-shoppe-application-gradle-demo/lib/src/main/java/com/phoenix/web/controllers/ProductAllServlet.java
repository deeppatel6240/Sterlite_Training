package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phoenix.data.Product;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.services.ProductService;
import com.phoenix.services.ProductServiceImpl;

/**
 * Servlet implementation class ProductAllServlet
 */
@WebServlet("/ProductAllServlet")
public class ProductAllServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try {
			//Presentation Layer
			PrintWriter out = response.getWriter();
			
			ProductService productService = new ProductServiceImpl();
			
			List<Product> products = productService.findAll();
		
			HttpSession session = request.getSession(false);

			if (session != null) {	
				session.setAttribute("products", products);
				response.sendRedirect("product.jsp");
			} else {
				out.println("<h1> Session is terminated<h1>");
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
