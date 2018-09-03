<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<form:form action="${loginProcessingUrl}" method="post">
		<table>
			<tr>
				<th colspan="2">Logowanie</th>
			</tr>
			<tr>
				<th><label for="username">Login: </label></th>
				<td><input type="text" id="username" name="username" /></td>
			<tr>
			<tr>
				<th><label for="password">Hasło: </label></th>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">Zaloguj</button></td>
			</tr>
		</table>
	</form:form>

</body>
</html>