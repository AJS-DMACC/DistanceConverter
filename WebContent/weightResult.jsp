<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Conversion Result</title>
</head>
<body>
<h1>BMI Converter Results</h1>
<p>
 height of ${userWeights.getInches()} inches <br />
 wieght of ${userWeights.getPounds()} lbs <br />
 BMI: ${userWeights.getBMI()}
</p>
<a href="index.jsp">Go to Distances Calculator</a><br />
<a href="weight.jsp">Calculate another BMI</a>
</body>
</html>