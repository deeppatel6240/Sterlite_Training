<%@ page language="java" contentType="text/html; charset=UTF-8"
    session="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>products</title>
</head>
<%@ include file = "header.html" %>	
<body bgcolor="gray">


	<% 
		HttpSession ss = request.getSession(false);
		if (ss != null)	{ %>
			
			<p> Dear, <%= ss.getAttribute("user") %> Select product of your choices</p>	
			
							
	<% 	} else {     %>
			<h2>Session is terminated</h2>
	<% 	}  %>
	
	
</body>

<%@ include file = "footer.html" %>
</html>