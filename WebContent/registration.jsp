<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Application</title>
</head>
<body>
<form action="registrationservlet" method="post" >

<FIELDSET style="width: 600px">
<LEGEND>User Registration</LEGEND>
<br>
<FIELDSET style="width: 500px">
<LEGEND>User Details</LEGEND>
	<table>	
		<tbody>
			<tr>
				<td align="right">Name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td align="right">Phone</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td align="right">email</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td align="right">Address</td>
				<td><input type="text" name="address"/></td>
			</tr>		
			<tr>
				<td align="right">Languages</td>
				<td><input type="text" name="languages" /></td>
			</tr>		
		</tbody>
	</table>

</FIELDSET>
<br>
<fieldset style="width: 500px">
<legend>Login Details</legend>

<table>	
		<tbody>
			<tr>
				<td align="right">UserID</td>
				<td><input type="text" name="uid"/></td>
				
				<td align="right">Password</td>
				<td><input type="text" name="password"/></td>
			</tr>
			
			
		</tbody>
	</table>


</fieldset>
<h5 align="center"><input type="submit" value="Save"></h5>
</FIELDSET>
</form>

</body>
</html>