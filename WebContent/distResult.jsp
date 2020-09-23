<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Distance Converstion Result</title>
</head>
<body>


<p>
${userDistValues.getInches()}inches is... <br /><br/><br/>
${userDistValues.getCentimeters()} centimeters <br />
${userDistValues.getMeters()} meters <br />
${userDistValues.getMiles()} miles <br />
${userDistValues.getMountEverest()} times the length of mount everest <br />
${userDistValues.getStatueOfLiberty()} times the length of the Statue of Liberty <br />
</p>
<a href="index.jsp">Enter another distance conversion</a><br />
<a href="weight.jsp">Enter a weight to convert</a>
</body>
</html>