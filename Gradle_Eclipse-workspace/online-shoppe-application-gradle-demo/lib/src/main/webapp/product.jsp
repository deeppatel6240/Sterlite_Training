<%@page import="com.phoenix.data.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    session="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<%@include file="header.html" %>
<body bgcolor="#8860D0">
	<%
		HttpSession ss = request.getSession(false);
	
		if(ss != null){ %>
		
		<%System.out.println("Product Session ID: " + ss.getId());%>
		<p align="center">Dear <%= ss.getAttribute("user") %> , Select Products of your choice.</p>
		<% List<Product> products = (List<Product>)ss.getAttribute("products"); %>
		
		<table border="2" align="center">
			<tr>
				<td>Product Id</td>
				<td>Name</td>
				<td>Brand</td>
				<td>Price</td>
			</tr>
			<% for(Product product : products){ %>	
			<tr>
				<td><%= product.getId() %></td>
				<td><%= product.getName() %></td>
				<td><%= product.getBrand() %></td>
				<td><%= product.getPrice() %></td>
			</tr>
			<%} %>
		</table>
	<% } else { %>
		<h2 style="color:red;">Sorry! Your Session is expired.</h2>
	<% } %>
</body>
<%@include file="footer.html" %>
</html>