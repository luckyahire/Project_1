<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="showTaxDetails" method="post">
	<label>Name :</label>
	<input type="text" name="uname">
	<br>
	<br>
	<label>Annual Salary :</label>
	<input type="number" name="sal">
	<br>
	<br>
	<label>  
	Gender:   
	</label>  <br>  
	<input type="radio" name="gender" value="male"/>Male    
	<br>  
	<input type="radio" name="gender" value="female"/>Female
	<br/> 
	<br/>  
	<input type="submit" value="ShowTax">
	</form>
	
</body>
</html>









