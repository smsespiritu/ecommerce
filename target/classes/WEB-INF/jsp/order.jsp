<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Management</title>
</head>
<body>
<h1>Orders Data</h1>
<form:form action="order.do" method="POST" commandName="order">
	<table>
		<tr>
			<td>Order ID</td>
			<td><form:input path="orderid" /></td>
		</tr>
		<tr>
			<td>Item</td>
			<td><form:input path="item" /></td>
		</tr>
		<tr>
			<td>Basket</td>
			<td><form:input path="basket" /></td>
		</tr>
		<tr>
			<td>Customer</td>
			<td><form:input path="customer" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Order ID</th>
	<th>Item</th>
	<th>Basket</th>
	<th>Customer</th>
	<c:forEach items="${orderList}" var="order">
		<tr>
			<td>${order.orderid}</td>
			<td>${order.item}</td>
			<td>${order.basket}</td>
			<td>${order.customer}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>