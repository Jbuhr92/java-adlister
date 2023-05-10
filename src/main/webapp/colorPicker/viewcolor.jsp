<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>View your color</title>
    <style>
        body {
        <c:if test="${color != null}">
            background-color: ${color};
        </c:if>
        }
    </style>
</head>
<body>
<h3>You have picked color: ${color}</h3>
</body>
</html>
