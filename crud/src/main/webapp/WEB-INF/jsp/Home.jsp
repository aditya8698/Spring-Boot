<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Welcome To Home Page</h1>
<br>
<input type="button" onclick="window.location.href='/register';return false;" value="Sign Up">&nbsp;
<input type="button" onclick="window.location.href='/login';return false;" value="Sign In">

${sid }
</div>
</body>
</html>