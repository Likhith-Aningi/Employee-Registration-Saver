<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
</head>
<body>
<form action="EmplyeeLogin" method='post'>
<table>
<tr><td>id : </td><td><input type='text' placeholder='id' name='uid'></td></tr>
<tr><td>password : </td><td><input type='password' placeholder='pass' name='upass'></td></tr>
</table>
<input type='submit' value='login'>
<input type='reset' value='reset'>
</form>
</body>
</html>