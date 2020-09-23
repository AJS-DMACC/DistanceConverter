<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
Weight Converter
</title>
</head>
<body>

<h1>BMI Converter</h1>
<form action= "getWeightsServlet" method= "post" > 
Enter the number of pounds: 
<input type= "text" name= "userPounds" size= " 1 0" > <br>
Enter the height in in inches
<input type= "text" name="userInches" size= " 1 0"> <br>
<input type= "submit" value= " Calculate BMI" />
</form>
<a href="index.jsp">Go to Distances Calculator</a>
</body>
</html>