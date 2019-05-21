<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/springmvc/">Back</a>
	<h1>Prof.Romipraveen is a Coding king of SGIC</h1>
	
	<table>
		<tr>
			<th>Id</th>
			<th>ClassificationName</th>
		</tr>
		<c:forEach var="classification" items="${classList}">
			<tr>
				<td><c:out value="${classification.ClassificationId}"/></td>
				<td><c:out value="${classification.ClassificationName}"/></td>
			<tr>
		</c:forEach>
	</table>
</body>
</html>