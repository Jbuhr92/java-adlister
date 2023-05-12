<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Your Profile" />
  </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<h1>You have successfully logged out ${username}</h1>

</body>
</html>
