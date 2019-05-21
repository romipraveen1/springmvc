<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome Hello World! </h2>


	<form:form action="/springmvc/saveClassification" method="post"
		modelAttribute="classification">
		<h5>Enter classifiction</h5>
		<br>
		<table border=1>
		<tr>
				<td>Classification Id :</td>
				<td><form:input path="classificationId"
						id="classificationId" /></td>
			</tr>
			<tr>
				<td>Classification Name :</td>
				<td><form:input path="classificationName"
						id="classificationName" /></td>
			</tr>
		</table>
		<input type="submit" value="Save" />

	</form:form>
</body>
</html>