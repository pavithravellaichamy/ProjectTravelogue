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
	<style type="text/css">
html { 
  background: url("F:\register4.jpg") no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
table.center{
	font: italic 25px Georgia,serif;
	margin-left:auto;
	margin-right:auto;
	margin-top:auto;
}
table,tr,th{
	font:  Georgia,serif;
}

.error{color:red}  
  
</style>
</head>
<body>
	<br><br><br><br><h1 align="center">TRAVELOGUE ~ Tourist Guide</h1>
	<table class="center">

	 <form:form action="saveUser" method="post" modelAttribute="users">
	 <tr>
		<td>
			User Name
		</td>
		<td>
			<form:input path="username"/>
		</td> 
	</tr>
	<tr>
		<td>
			Name
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			Password
		</td>
		<td>
			<form:input type="password" path="password" />
		</td> 
	</tr>
		<tr>
		<td>
			Reenter_Password
		</td>
		<td>
			<form:input  type="password" path="reenter_password" />
		</td> 
	</tr>
	<tr>
		<td>
			EmailID
		</td>
		<td>
			<form:input type="email" path="emailid" />
		</td> 
	</tr>
	<tr>
	<tr>
		<td>
			DOB
		</td>
		<td>
			<form:input path="dob" />
		</td> 
	</tr>
	<tr>
		<td>
			Age
		</td>
		<td>
			<form:input path="age" />
			<form:errors path="age" cssClass="error"/>
		</td> 
	</tr>
	<tr>
		<td>
			City
		</td>
		<td>
			<form:input path="city" />
		</td> 
	</tr>
	<tr>
	<td>Select Interest </td><td><form:select path="interest">
			<form:option value="Hill Stations" label="Hill Stations"/>
			<form:option value="Water Areas" label="Water Areas"/>
			<form:option value="Temples" label="Temples"/>
			<form:option value="Theme Parks" label="Theme Parks"/>
		</form:select></td></br></br>
	</tr>
	<tr align="center">
	<td><input type = "submit" value="submit" name="go to login"/></td>
	</tr>
	</form:form>
	</table>
	</body>
</html>