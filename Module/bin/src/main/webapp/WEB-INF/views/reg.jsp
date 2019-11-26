<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Regstration</title>
</head>
<body>
<a href="login">Login</a><br>

<a href="/">Home</a><br>



<form  action="regstration" method="POST">
<input type="text" name="name" placeholder="User Name"><br>
<input type="number" name="number" placeholder="Phone"><br>
<input type="text" name="add" placeholder="Addresh"><br>

<input type="password" name="password" placeholder="Password"><br>
<input type="password" name="passwordConfirm" placeholder="Conform Password"><br>
<input type="submit">


</form>
</body>
</html>