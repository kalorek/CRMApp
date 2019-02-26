<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 31.01.19
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Lista zadań</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Data utworzenia</th>
            <th>Nazwa</th>
            <th>Opis</th>
            <th>Aktualny użytkownik</th>

        </tr>
        <c:forEach items="${tasks}" var="task">
            <tr>
                <td>${task.creationDate}</td>
                <td>${task.name}</td>
                <td>${task.id}</td>
                <td>${task.description}</td>
                <td>${task.actualUsers}</td>

            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
