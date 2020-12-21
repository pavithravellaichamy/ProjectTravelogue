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
<style>
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

table.center{
	font: italic 20px Georgia,serif;
	margin-left:auto;
	margin-right:auto;
	margin-top:auto;
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

</style>
</head>
<body>
<ul>
  <li><a href="./home">Home</a></li>
  <li><a class="active" href="./suggestions">Suggestions</a></li>
   <li style="float:right"><a href="./logout">Logout</a></li>
  <li style="float:right"><a href="./upload">Profile</a></li>
</ul>

	<c:forEach var="suggestion" items="${listSuggestion}">
	<br><br><br><br><br>
	<table class="center">
	<tr>
	<td>User Name</td>
	<td>${suggestion.username}</td>
	</tr>
	<tr>
	<td>Location</td>
	<td><a href="${suggestion.location}">Click Here!</a></td>
	</tr>
	<tr>
	<td>Spot</td>
	<td>${suggestion.spot}</td>
	</tr>
	<tr>
	<td>Date</td>
	<td>${suggestion.date}</td>
	</tr>
	<tr>
	<td>Review</td>
	<td>${suggestion.review}</td>
	</tr>
	<tr>
	<td>Ratings</td>
	<td>${suggestion.rating}<td></tr>
	</table>
	<br><br>
	</c:forEach>
</body>
</html>