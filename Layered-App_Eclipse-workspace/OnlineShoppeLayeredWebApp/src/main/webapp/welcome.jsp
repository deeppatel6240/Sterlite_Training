<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<%@include file="header.html" %>
<body bgcolor="#84CEEB">
	<h3>Dear <jsp:getProperty property="username" name="ob"/>, Welcome to Phoenix</h3>
	<%
		String username = request.getParameter("username");
	
		//setting attribute
		session.setAttribute("user", username);
		
		//setting interval
		session.setMaxInactiveInterval(10);
		
		//debug session id
		System.out.println("Welcome Servlet Session ID: "+session.getId());
		
		//encoding product url
		String encodedProductUrl = response.encodeURL("ProductAllServlet");
	%>
	<p>Session time out is: <%=session.getMaxInactiveInterval() %> second</p>
	<p>To enjoy Shopping <a href="<%= encodedProductUrl %>">Click here</a>
</body>
<%@include file="footer.html" %>
</html>