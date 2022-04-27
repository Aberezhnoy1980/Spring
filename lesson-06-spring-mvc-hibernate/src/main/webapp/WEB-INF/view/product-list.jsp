<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List:</h1>
<ul>
    <c:forEach var="product" items="${products}">
        <c:url var="viewUrl" value="/product/ + ${product.id}"/>
        <li>
            <a href="${viewUrl}">View</a>
            <br>
            Product title: ${product.title}
            <br>
            Product price: ${product.price}
            <br>
        </li>
    </c:forEach>
</ul>
<br>
<c:url var="createUrl" value="/product/create"/>

<a href="${createUrl}">CREATE</a>
</body>
</html>