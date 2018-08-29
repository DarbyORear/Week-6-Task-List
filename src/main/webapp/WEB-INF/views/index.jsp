<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session &amp; Cookie Demo</title>
</head>
<body>
<h1>To do:</h1>

			<table class="table">
			<thead>
				<tr>
					<th>Task</th><th>Due Date</th><th>Complete?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="task" items="${task}">
					
				<tr>
					<td>${task.description}</td>
					<td>${task.due_date}</td>
					<td><button>Click if complete</button></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
</body>
		

		
</html>