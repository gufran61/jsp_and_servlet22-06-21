<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
<style>
.container{
width: 30%;
border: 1px solid black;
margin: auto;
padding: 20px;
font-size: 20px;
}
#myform table tr td input{
font-size: 20px;
}
</style>
</head>
<body>
<div class="container">
<h1>My Form</h1>
<form action="Registerservlet" method="post">
<table>
<tr>
<td>Enter Your Name</td>
<td><input type="text" name="username" placeholder="Enter Here"> </td>
</tr>
<tr>
<td>Enter Your Password</td>
<td><input type="password" name="password" placeholder="Enter Here"> </td>
</tr>
<tr>
<td>Enter Your Email</td>
<td><input type="email" name="email" placeholder="Enter Here"> </td>
</tr>
<tr>
<td>Select Gender</td>
<td><input type="radio" name="usergender" value="male">Male &nbsp; &nbsp; <input type="radio" name="usergender" value="female">Female</td>
</tr>
<tr>
<td>Select Your Course</td>
<td>
<select name="usercourse">
<option value="java">Java</option>
<option value="phython">Phython</option>
<option value="c">C</option>
<option value="ruby">Ruby</option>
</select>
</td>
</tr>
<tr>
<td style="text-align: right;">
<input type="checkbox" value="checked" name="condition">
</td>
<td> Agree terms and condition</td>
</tr>
<tr>
<td>

</td>
<td>
<button type="submit">Register</button>
<button type="reset">Reset</button>
</td>
</tr>
</table>
</form>
</div>
</body>
</html>