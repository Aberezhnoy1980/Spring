<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h2> Product title: ${product.get().title}</h2>
<h2> Product price: ${product.get().price}</h2>
<h2> Product price: ${product.get().id}</h2>

<c:url var="deleteUrl" value="/product/delete">
    <c:param name="id" value="${product.get().id}"/>
</c:url>

<a href="${deleteUrl}">DELETE</a>
</body>
</html>
