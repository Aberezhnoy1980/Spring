<%@ page import="ru.aberezhnoy.model.Cat" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 27.03.2022
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cat</title>
</head>
<body>
<h1>Cat</h1>
<p>Name: ${cat.name}</p>
<p>Age: ${cat.age}</p>
<p>Children</p>
<hr>
<ul>
    <% if (((Cat)request.getAttribute("cat")).getChildren() != null) %>
    <% for (Cat value : (List<Cat>) ((Cat)request.getAttribute("cat")).getChildren()) { %>
        <li>name: <%=value.getName()%>; age: <%=value.getAge()%></li>
        <% } %>
</ul>
</body>
</html>
