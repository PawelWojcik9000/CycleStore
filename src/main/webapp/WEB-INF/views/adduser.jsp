<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>

	<form:form method="post" modelAttribute="user">
		<table>
			<tr>
				<th>Nazwa użytkownika: </th>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<th>Hasło: (co najmniej 5 znaków)</th>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<th>Imię: </th>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<th>Nazwisko: </th>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<th>Adres e-mail: </th>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<th>Adres: </th>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<th>Telefon: </th>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="Zarejestruj"></th>
			</tr>
		</table>
	</form:form>

</body>
</html>