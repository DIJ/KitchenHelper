<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Management</title>
</head>

<body>

	<h1><s:message code="productmanagement.inventory" /></h1>

	<table>
		<thead>
			<tr>
				<th><s:message code="productmanagement.inventorylist.name" /></th>
				<th><s:message code="productmanagement.inventorylist.insertiondate" /></th>
				<th><s:message code="productmanagement.inventorylist.expirationdate" /></th>
				<th><s:message code="productmanagement.inventorylist.quantity" /></th>
				<td><s:message code="productmanagement.inventorylist.expirationstatus" /></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${allProducts}" varStatus="typeStatus">
              <tr>
                <td><c:out value="${product.name}" /></td>
				<td><c:out value="${product.insertionDate}" /></td>
				<td><c:out value="${product.expirationDate}" /></td>
				<td><c:out value="${product.quantity}" /></td>
				<td><c:out value="${${product.expirationStatus}" /></td>
              </tr>
            </c:forEach>
		</tbody>
	</table>
	<br />
	<a href="/product/productinsertion"><s:message code="productmanagement.inventory" /></a>
</body>
</html>