<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Color Picker</title>
</head>
<body>

    <form action="pickcolor" method="post">

        <label for="pickedColor">Pick a Color:</label>
        <input type="text" name="pickedColor" id="pickedColor">
        <input type="submit" value="Submit">

    </form>
</body>
</html>
