<!-- 

/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" import="java.util.List,com.phoenix.data.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<style type="text/css">
	table{
		border-collapse: collapse;
	}
	.th{
		border: 2px solid black;
		padding: 15px;
	}
	.td{
		border: 1px solid black;
		padding: 10px;
	}
	
</style>
</head>
<body bgcolor="skyblue">

	<%@ include file="header.html" %>

	<%
		HttpSession ss = request.getSession(false);
		
		if(ss != null){ %>
			
			<h2 style="text-align: center;"> Welcome <em style="color: purple;"> <%= ss.getAttribute("user") %> </em>  , Purchase the Products that you want! </h2>
			
			<% List<Product> products = (List<Product>)ss.getAttribute("products"); %>
			
			<div class="container" style="padding-left: 30%">
				<table style="text-align: center;" border="3px solid black">
					<tr class="tr">
						<th class="th"> Product Id </th>
						<th class="th"> Name </th>
						<th class="th"> Brand </th>
						<th class="th"> Price </th>
					</tr>
					
					<% for(Product product: products) { %>
						<tr class="tr"> 
							<td class="td"> <%= product.getId() %> </td>
							<td class="td"> <%= product.getName() %> </td>
							<td class="td"> <%= product.getBrand() %> </td>
							<td class="td"> <%= product.getPrice() %> </td>
						</tr>
					<% } %>
					
						 
				</table>
			</div>
			
			<%	
				// Encode Url
				String url1 = response.encodeURL("ProductSortServletByPrice");
				String url2 = response.encodeURL("ProductSortServletByPriceDesc");
				String url3 = response.encodeURL("ProductSortServletByName");
				String url4 = response.encodeURL("ProductSortServletByBrand");				
			%>
			
			<div style="text-align: center;">
				<h3> <a href="<%= url1 %>"> Sort By Price </a> </h3>  
				<h3> <a href="<%= url2 %>"> Sort By Price in Desc Order </a> </h3>
				<h3> <a href="<%= url3 %>"> Sort By Name </a> </h3>
				<h3> <a href="<%= url4 %>"> Sort By Brand</a> </h3> 
				<h3> <a href="AddProduct.html"> Add Product </a> </h3>  
				<h3> <a href="UpdateProduct.html"> Update Product </a> </h3>   
				<h3> <a href="DeleteProduct.html"> Delete Product </a> </h3>
				<h3> <a href="FindProductByName.html"> Find Product By Name </a> </h3>
				<h3> <a href="FindProductById.html"> Find Product By Id </a> </h3>
				<h3> <a href="FindProductByBrand.html"> Find Product By Brand </a> </h3>
				<h3> <a href="FindProductByPrice.html"> Find Product By Price </a> </h3>
				<h3> <a href="FindProductByPriceRange.html"> Find Product By Price Range </a> </h3>
				<h3> <a href="FindProductByNameAndBrand.html"> Find Product By Name and Brand</a> </h3>
				<h3> <a href="FindProductByNameAndPrice.html"> Find Product By Name and Price</a> </h3>
				<h3> <a href="FindProductByBrandAndPrice.html"> Find Product By Brand and Price</a> </h3>
				
				
			</div>
			
	<%	}
		else{ %>
		
			<h2 style="text-align: center; color: red; margin-bottom: 25%"> Sorry! Your Session is Expired! </h2>
	
	<%	}	%>

	<%@ include file="footer.html" %>
	
</body>
</html>