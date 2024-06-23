<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h1 align="center">Register new Admin Here...</h1>
	<form action="Adminreg" method="post">
		<table style="margin-left: 500px" border="1" cellpadding="3">
			<tr>
				<td>username  <input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password    <input type="password" name="pass"></td>
			</tr>
			<!-- <tr>
				<td>UserType    <input type="text" name="utype"></td>
			</tr> -->
		</table><br>
		<input style="margin-left: 650px" type="Submit" value="Register">
	</form>

</body>
</html>