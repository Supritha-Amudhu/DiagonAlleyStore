<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="TemplateHeader.css"></link>
<script type="text/javascript" src="imageslider.js"></script>
</head>
<body>

<div id="div1">
<a href = "diagonalley_HomePage.jsp">Home Page</a>
</div>

<div id="menu">
<ul class ="div2">
<li class="menuoptions"><a class = "options" href="" >Robes</a></li>
<li class="menuoptions"><a class = "options" href="#">Wand</a></li>
<li class="menuoptions"><a class = "options" href="#">Pets</a></li>
<li class="menuoptions"><a class = "options" href="#">Books</a></li>
</ul>
</div>

<div>

<div id = "logindiv">
<form action="loginValidationServlet" method="get">
<table cellpadding="10px" cellspacing="10px">
<tr>
<td id="loginfailerror"></td>
</tr>
<tr>
<td>Email : </td>
<td><input type="text" name="loginemail"/></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="loginpassword"/></td>
</tr>
</table>
<center><input type="submit" name="loginbutton" value = "Login!" id="loginbutton"/></center>
</form>
</div>

<div id = "registerdiv">
<form action="diagonalley_registration.jsp">
<button id="registerbutton">Register !! </button> 
</form>
</div>
</div>

</body>
</html>