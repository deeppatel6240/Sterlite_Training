<!-- 

/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 5th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

 -->
 
<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">

</jsp:useBean>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body bgcolor="skyblue">

	<%@ include file="header.html" %>
	
	<h2 style="text-align: center;"> Hey <em style="color:purple;"> <%= request.getParameter("uname") %> </em> , Welcome to the <strong> Flipkart </strong> </h2>
	
	<%
		// Storing Username in Session
		String user = request.getParameter("uname");
		session.setAttribute("user", user);
		
		// Session Time-out Period
		session.setMaxInactiveInterval(300); %>
		<h3 style="text-align: center; color: red"> Hello <%= request.getParameter("uname") %>, Your Session is Expired in <%= session.getMaxInactiveInterval() %> Seconds! </h3>
	
	<%	
		// Encode Url
		String url = response.encodeURL("ProductAllServlet");
	%>
	
	<h3 style="text-align: center;"> So Go For Shopping <a href="<%= url %>"> Click </a> </h3>

	<%@ include file="footer.html" %>

</body>
</html>