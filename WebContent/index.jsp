<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
Distance Converter
</title>
</head>
<body>

<h1>Distance Converter</h1>
<!-- 
<form action= " getCents Servlet" method= "post" > 
Enter the length in feet: 
<input type= "text" name= " userCents " size= " 1 0" > 
<input type= "submit" value= " Calculate Coins " />
-->

<form action= " getDistancesServlet" method= "post" > 
Enter the number of feet: 
<input type= "text" name= "userFeet" size= " 1 0" > <br>
Enter the number of inches: 
<input type= "text" name= "userInches" size= " 1 0" > 
<input type= "submit" value= " Calculate Distances" />
</form>
<a href="weight.jsp">Enter a weight to convert</a>
</body>
</html>