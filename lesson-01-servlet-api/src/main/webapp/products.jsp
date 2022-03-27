<%@ page import="ru.aberezhnoy.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Products</h1>
<table>
    <tr>
        <th>id</th>
        <th>Title</th>
        <th>Cost</th>
    </tr>
        <% for (Product p : (List<Product>) request.getAttribute("product")) { %>
    <tr>
        <td><%=p.getId()%></td>
        <td><%=p.getTitle()%></td>
        <td><%=p.getCost()%></td>
    </tr>
        <% } %>
</table>
</body>
</html>
