<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session &amp; Cookie Demo</title>
<link rel="stylesheet" href="/theme.css" />
</head>
<body>
<h1>To do:</h1>
	<ul>
				<c:forEach var="mytask" items="${task}">
					<!--  <a href="/index/${myitem.id}">${myitem.name}</a>-->
					<li>${mytask.description}</li>
					<li>${mytask.due_date}</li>
				</c:forEach>
	</ul>
		
		
</body>
		

		
</html>