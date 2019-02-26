<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 01.02.19
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Priorytety</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Nazwa</th>
            <th>Aktywność</th>



        </tr>
        <c:forEach items="${priorities}" var="priority">
            <tr>
                <td>${priority.name}</td>
                <td>${priority.active}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
