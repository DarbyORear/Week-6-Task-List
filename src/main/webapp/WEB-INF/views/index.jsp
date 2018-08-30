<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<h1>Login</h1>
	

	
	<form action="/submit" method="post">
		<p>
			<label for="username">Username:</label> <input id="username" name="username" value="${ param.username }" required minlength="2" />
		</p>		<p>
			<label for="emailaddress">Password(email):</label> <input id="emailaddress" type="email" name="emailaddress" value="${ param.emailaddress }" required minlength="2" />
		</p>
		<p>
			<button><a href = "/submit">Submit</a></button>
		</p>
	</form>
	
	or
	
	<p>
	<!-- to add parameters: do ?parameter= -->
		<a href="https://github.com/login/oauth/authorize?client_id=a8ce7567c14e2ba56f16">Sign in with GitHub</a>
	</p>
</body>
</html>