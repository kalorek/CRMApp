<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 01.02.19
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Status</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Nazwa</th>
            <th>Aktywność</th>
            <th>Sortowanie</th>


        </tr>
        <c:forEach items="${statuses}" var="status">
            <tr>
                <td>${status.name}</td>
                <td>${status.active}</td>
                <td>${status.sort}</td>


            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
