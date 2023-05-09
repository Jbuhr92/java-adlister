<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int count = 0; %>
<% count +=1; %>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Start Page"/>
    </jsp:include>
</head>
<body>

    <h1> The current count is <%= count %> </h1>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>

</body>
</html>
