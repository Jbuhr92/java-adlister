<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Guessing Game</title>
</head>
<body>

<form action="guess" method="post">

    <label for="userGuess">Pick a number between 1 and 3:</label>
    <input type="text" name="userGuess" id="userGuess">
    <input type="submit" value="Submit">

</form>

</body>
</html>
