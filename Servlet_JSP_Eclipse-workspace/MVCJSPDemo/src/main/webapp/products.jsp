<%@ page language="java" contentType="text/html; charset=UTF-8"
    session="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>products</title>
</head>

<body bgcolor="gray">
	<%@ include file="header.html"%>

	<%
	HttpSession ss = request.getSession(false);
	if (ss != null) {
	%>

	<p>
		Dear,
		<%=(String) ss.getAttribute("user")%>
		Select product of your choices
	</p>
	<%
	} else {
	%>
	<h2>Session is terminated</h2>
	<%
	}
	%>

	<%@ include file="footer.html"%>
</body>
</html>