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

table.center{
	font: italic 20px Georgia,serif;
	margin-left:auto;
	margin-right:auto;
	margin-top:auto;
}
div#animat
{
	text-align:center;
	padding:25px;
	height:20px;
	width:200px;
	background:#00cccc;
	box-shadow:5px 5px 5px yellow;
	font-size:20px;
	-webkit-transition: -webkit-transform 2s,width 2s,height 2s;
}
div#animat:hover
{
	-webkit-transform:rotate(360deg);
	height:20px;
	width:200px;
}
img:hover {
 	width:250px;
	height:250px;
}

.active {
  background-color: #4CAF50;
}
</style>
</head>
<body>
<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="./suggestions">Suggestions</a></li>
  <li style="float:right"><a href="./logout">Logout</a></li>
  <li style="float:right"><a href="./upload">Profile</a></li>
</ul>
<br><br><br>
<p>
		<img src="F:\events.jpg" height="200px" width="200px"/>
		<img src="F:\events1.jpg" height="200px" width="200px"/>
		<img src="F:\events5.jpg" height="200px" width="200px"/>
		<img src="F:\events2.jpg" height="200px" width="200px"/>
		<img src="F:\places.jpg" height="200px" width="200px"/>
		<img src="F:\places1.jpg" height="200px" width="200px"/>
		<img src="F:\places2.jpg" height="200px" width="200px"/></br></br></br>
		<img src="F:\places3.jpg" height="200px" width="200px"/>
		<img src="F:\places4.jpg" height="200px" width="200px"/>
		<img src="F:\places6.jpg" height="200px" width="200px"/>
		<img src="F:\places7.jpg" height="200px" width="200px"/>
		<img src="F:\events3.jpg" height="200px" width="200px"/>
		<img src="F:\events4.jpg" height="200px" width="200px"/>
		<img src="F:\events6.jpg" height="200px" width="200px"/>
	</p>
</body>
</html>