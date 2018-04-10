<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>List Products</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of Products</h2>  
    <table>
        <tr>
            <td>id</td><td>Name</td><td>Quantity</td>><td></td>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.quantity}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New Product</a>
</body>
</html>