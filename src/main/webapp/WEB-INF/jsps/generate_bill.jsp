<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>generate bill</title>
</head>
<body>
	<h2>Generate| Bill</h2>
	<form action="saveBill" method="post">
		<pre>
		First Name<input type="text" name="firstName" value="${contact.firstName}"/>
		Last Name<input type="text" name="lastName" value="${contact.lastName}"/>
		Email<input type="email" name="email" value="${contact.email}"/>
		Mobile<input type="number" name="mobile" value="${contact.mobile}"/>
		Product<input type="text" name="product" />
		Amount<input type="text" name="amount" />
		
	</pre>
	<input type="submit" value="generate bill"/>
		
	</form>
</body>
</html>