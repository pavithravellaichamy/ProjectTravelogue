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
 /* background: url("F:\register4.jpg") no-repeat center center fixed; */
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
table.center{
	font: italic 20px Georgia,serif;
	margin-left:auto;
	margin-right:auto;
	margin-top:auto;
}
table,tr,th{
	font:  Georgia,serif;
}
body {margin:0;}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  position: fixed;
  top: 0;
  width: 100%;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 20px 30px;
  text-decoration: none;
  font-
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}

.error{color:red}  
</style>
</head>

<body>

	<ul>
  		 <li><a href="./home">Home</a></li>
  		 <li><a href="./suggestions">Suggestions</a></li>
  		 <li><a href="./events">Events</a></li>
  		 <li style="float:right"><a href="./logout">Logout</a></li>
 		 <li style="float:right"><a class="active" href="./upload">Profile</a></li>
	</ul>
	<br><br><br><br><br>
	<h1 align="center">It's time to suggest others :)</h1></br></br>
	<table class="center">
	 <form:form action="./saveReview" method="post" modelAttribute="suggestion">
	 <tr>
		<td>
			<form:label path="username">
				<spring:message text="Enter User Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="username" />
		</td> 
	</tr>
	 <tr>
		<td>
			<form:label path="location">
				<spring:message text="Enter the location"/>
			</form:label>
		</td>
		<td>
			<form:input path="location" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="spot">
				<spring:message text="Enter Spot"/>
			</form:label>
		</td>
		<td>
			<form:input path="spot" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="date">
				<spring:message text="Enter Date"/>
			</form:label>
		</td>
		<td>
			<form:input id="date" path="date" />
		</td> 
	</tr>
		<tr>
		<td>
			Enter Review
		</td>
		<td>
			<form:textarea path="review"/>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="rating">
				<spring:message text="Enter Rating"/>
			</form:label>
		</td>
		<td>
			 <form:input  path="rating" />
			 <form:errors path="rating" cssClass="error"/>
		</td> 
	</tr>
	<tr>
	<td>
	<input type="submit" name="submit" value="submit"/>
	</td>
	</tr>
	</form:form>
	</table>
	</body>
</html>