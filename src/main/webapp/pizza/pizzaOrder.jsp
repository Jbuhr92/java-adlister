<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order a Pizza</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/pizza-order" method="post">
        <label for="crust">Choose a Crust</label>
        <select id="crust" name="crust">
            <option value="thin">Thin Crust</option>
            <option value="stuffed">Stuffed Crust</option>
            <option value="healthy">Heart Healthy</option>
            <option value="chicago">Chicago Style</option>
        </select>
        <label for="sauce">Choose a Sauce</label>
        <select id="sauce" name="sauce">
            <option value="marinara">Marinara Sauce</option>
            <option value="alfredo">Alfredo Sauce</option>
            <option value="barbque">Bar-B-Que Sauce</option>
            <option value="buffalo">Buffalo Sauce</option>
        </select>
        <label for="size">Choose a Size</label>
        <select id="size" name="size">
            <option value="small">Small Size Pizza</option>
            <option value="medium">Medium Size Pizza</option>
            <option value="large">Large Size Pizza</option>
            <option value="challenge">Challenge Size Pizza</option>
        </select>

        <fieldset>
            <legend>Toppings:</legend>
            <label for="pepperoni">Pepperoni:</label>
            <input type="checkbox" name="toppings" value="Pepperoni" id="pepperoni"><br>
            <label for="Sausage">Sausage:</label>
            <input type="checkbox" name="toppings" value="Sausage" id="Sausage"><br>
            <label for="Peppers">Peppers:</label>
            <input type="checkbox" name="toppings" value="Peppers" id="Peppers"><br>
            <label for="Mushrooms">Mushrooms:</label>
            <input type="checkbox" name="toppings" value="Mushrooms" id="Mushrooms"><br>
            <label for="Pineapple">Pineapple:</label>
            <input type="checkbox" name="toppings" value="Pineapple" id="Pineapple"><br>
        </fieldset>
        <label for="address">Enter your address</label>
        <input type="text" name="address" id="address">
        <input type="submit" value="Submit">
    </form>

    <c:if test="${pizza != null}">
        <h2>Your pizza order:</h2>
        <p>${pizza.crust}</p>
        <p>${pizza.sauce}</p>
        <p>${pizza.size}</p>
        <p>Toppings:</p>
        <ul>
            <c:forEach var="topping" items="${pizza.toppings}">
                <li>${topping}</li>
            </c:forEach>
        </ul>
        <p>${pizza.address}</p>
    </c:if>

</body>
</html>
