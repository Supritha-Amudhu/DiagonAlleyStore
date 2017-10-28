<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
Registration
</title>
<link rel="stylesheet" type="text/css" href="TemplateHeader.css"></link>
<script type="text/javascript" src="imageslider.js"></script>

</head>
<body>

<div id="div1">
<a href = "diagonalley_HomePage.jsp">Home Page</a>
</div>

<div id="slider_container">

<div id = "slider_image">
<img id="sliderimage1" src="Images/Robe10.jpg" height="300px" width="500px">
</div>


<div id = "slider_buttons">
<ul>
<img id="sliderbutton1" src="Images/heartgreen.png" height="20px" width="20px"/>
<img id="sliderbutton2" src="Images/heartgreen.png" height="20px" width="20px"/>
<img id="sliderbutton3" src="Images/heartgreen.png" height="20px" width="20px"/>
<img id="sliderbutton4" src="Images/heartgreen.png" height="20px" width="20px"/>
</ul>
</div>
</div>

<div id="menu">
<ul class ="div2">
<li class="menuoptions"><a class = "options" href="" >Robes</a></li>
<li class="menuoptions"><a class = "options" href="#">Wand</a></li>
<li class="menuoptions"><a class = "options" href="#">Pets</a></li>
<li class="menuoptions"><a class = "options" href="#">Books</a></li>
</ul>
</div>


<div id="tablediv">
<table align="center" cellpadding="15px" cellspacing="15px">
<form action="registrationServlet" method="post" name="regForm" onsubmit="return validate()">
<tr>
<td>Name : </td>
<td><input type="text" name="name"/></td>
<td></td>
</tr>
<tr>
<tr>
<td>Password : </td>
<td><input type="password" name="password" onblur="return validatepassword()"/></td>
<td id="tdpassword"></td>
</tr>
<tr>
<tr>
<td>Confirm Password : </td>
<td><input type="password" name="confirmpassword" onblur="return validateconfirmpassword()"/></td>
<td id = "tdconfirmpassword"></td>
</tr>
<tr>
<td>Shipping Address : </td>
<td><input type="text" name="shippingaddress"/></td>
<td></td>
</tr>
<tr>
<td>Billing Address : </td>
<td><input type="text" name="billingaddress"/></td>
<td></td>
</tr>
<tr>
<td>Email : </td>
<td><input type="text" name="email" onblur="return validateemail()"/></td>
<td id="tdemail"></td>
</tr>
<tr>
<td>Phone Number : </td>
<td><input type="text" name="phone" onblur="return validatephone()"/></td>
<td id = "tdphone"></td>
</tr>
</table>
<center>
<input id="button" type="submit" name="submit" value="Register!"/>
</form>
</center>
</div>

</body>
</html>


 