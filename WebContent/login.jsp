<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>JSP Application</title>
</head>
<body>
<p>Hello</p>
<form action="loginServlet" method="post" >

<FIELDSET style="width: 300px">
<LEGEND>Login to App</LEGEND>
	<table>	
		<tbody>
			<tr>
				<td>User ID</td>
				<td><input type="text" name="uid" required="required"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="required"/></td>				
			</tr>
			<tr>
			<td><input type="submit" value="login" /></td>
			<td><input type="reset" value="Reset"/>&nbsp &nbsp <a href="registration.jsp">Register</a></td>
			</tr>
		</tbody>
	</table>
	

</FIELDSET>
</form>

</body>
</html>