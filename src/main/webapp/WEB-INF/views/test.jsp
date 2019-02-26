<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Test jsp</title>
</head>
<body>
<c:if test="${Math.random() > 0.5}">
    <p>super</p>

</c:if>

</body>
</html>
