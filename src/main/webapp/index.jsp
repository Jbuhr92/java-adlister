<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Start Page"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<form action="login.jsp" method="get">
    <input type="submit" value="Login">
</form>
</body>
</html>
