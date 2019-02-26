<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 01.02.19
  Time: 09:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Lista użytkowników</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Login</th>
            <th>Imię</th>
            <th>Nazwisko</th>


        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.login}</td>
                <td>${user.name}</td>
                <td>${user.lastName}</td>


            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
