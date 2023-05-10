<%--
  Created by IntelliJ IDEA.
  User: johnbuhr
  Date: 5/10/23
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Outcome!</title>
</head>
<body>
<c:if test="${outcome != null}">
    <p>${outcome}</p>
</c:if>
</body>
</html>
