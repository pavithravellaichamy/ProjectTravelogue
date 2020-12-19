<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
html { 
  background: url("F:\home2.jpg") no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
table.center{
	font: italic bold 30px Georgia,serif;
	margin-left:auto;
	margin-right:auto;
	margin-top:auto;
}
table,tr,th{
	font:  Georgia,serif;
}
</style>	
</head>
<body >
	<br><br><br><br><br><br>
	<h1 align="center">TRAVELOGUE ~ Tourist Guide</h1></br></br></br><br>
	<table class="center">
	<c:url var="registeruser" value="/register" ></c:url>

	<form:form action="./userpage"  method="post">
		<tr>
		<td> 
			Enter UserName
		</td>
		<td>
			<input type="text" name="username" />
		</td>
		</tr>
		<tr>
		<td>
			Enter Password 
		</td>
		<td>
			<input type="password" name="password" />
		</td>
		</tr>
		<tr>
		<td> <h3>&nbsp;  &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  
		<input type = "submit" value="Submit" name="submit"/>
		<input type = "reset" value="Reset" name="reset"/></h3></td>
		</tr>
	</form:form>
	<table></br></br>
</body>
</html>