<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Create a Post" />
    </jsp:include>
</head>
<body>
<div class="container">
    <jsp:include page="/partials/navbar.jsp" />
    <h1>Create a Blog Post</h1>
    <form action="/createPost" method="post">
        <label for="post">Your Post</label>
        <textarea name="post" id="post" cols="30" rows="10"></textarea>
        <input type="submit" value="Submit">
    </form>
    <c:if test="${post != null}" >
        <h3>Your blog post:</h3>
        <p>${post}</p>
    </c:if>
</div>
</body>
</html>
