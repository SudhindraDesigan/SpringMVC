<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>

</head>

<body>

	<h2>Enter Product Details</h2>

	<form:form method="POST" modelAttribute="product" action="/sample/saveproduct">
		
		<table>
			<tr>
				<td><label for="id">ID: </label></td>
				<td><form:input path="id" id="id" /></td>

			</tr>

			<tr>
				<td><label for="name">Name: </label></td>
				<td><form:input path="name" id="name" /></td>
			</tr>

			<tr>
				<td><label for="quantity">Quantity: </label></td>
				<td><form:input path="quantity" id="quantity" /></td>

			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/list' />">List of All Products</a>
</body>
</html>