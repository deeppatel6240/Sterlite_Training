<jsp:useBean id="Lgn" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>



<body bgcolor="red">
	
	<%@ include file = "header.html" %>
	
	<h3>Dear <jsp:getProperty property="username" name="Lgn"/>, Welcome on my shop.</h3>
	<%
		String username = request.getParameter("username");
		session.setAttribute("user", username);
		
		System.out.println("book1" + request.getParameter("book1"));
		System.out.println("session id is : " + session.getId());
		
		session.setMaxInactiveInterval(10);
		
		int timeOut = session.getMaxInactiveInterval();
		
		String enProUrl = response.encodeURL("products.jsp");
	%> 
	<p>Time out period is : <%= timeOut %></p>
	
	<p>To enjoying shopping<a href="<%= enProUrl %>">Click here</a></p> 
	
	<%@ include file = "footer.html" %>
</body>


</html>