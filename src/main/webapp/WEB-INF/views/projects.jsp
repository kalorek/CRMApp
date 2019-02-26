<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 31.01.19
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Lista projektów</title>
</head>
<body>
    <div>
        <table>
            <tr>
                <th>Data utworzenia</th>
                <th>Nazwa</th>
                <th>Identyfikator</th>
                <th colspan="3">Opcje</th>
            </tr>
            <c:forEach items="${projects}" var="proj">
                <tr>
                    <td>${proj.creationDate}</td>
                    <td>${proj.name}</td>
                    <td>${proj.id}</td>
                    <td><a>Lista zadań</a></td>
                    <td><a>Szczegóły</a></td>
                    <td><a>Edycja</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>
