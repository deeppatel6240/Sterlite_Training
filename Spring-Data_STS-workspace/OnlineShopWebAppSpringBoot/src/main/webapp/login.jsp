<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online shop - Login</title>
</head>
<body>
	<h1 style="color:#14A76C;" align="center">User Login Form</h1>
	<h2 style="color:red">${logonerror}</h2>
	<form action="Login" method="post" align="center">
		<label style="color:#14A76C; font-size: 1.3rem" for="username">User name:</label><br>
		<input style="padding: 7px 25px;" type="text" name="username" placeholder="username" size="25"><br>
		
		<label style="color:#14A76C; font-size: 1.3rem" for="password">Password:</label><br>
		<input style="padding: 7px 25px;" type="password" name="password" placeholder="password" size="25"><br><br>
		
		<input type="submit" value="Sign In" style="color: #14A76C; padding: 7px 35px" >
	</form>
</body>
</html>