<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
if (request.getMethod().equalsIgnoreCase("post")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    }
}
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1> Please Log In</h1>
<form action="login.jsp" method="post">
    <input name="username" type="text">
    <input name="password" type="text">
    <input type="submit" value="Log In">
</form>

</body>
</html>
