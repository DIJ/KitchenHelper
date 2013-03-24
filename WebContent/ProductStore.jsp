<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store product</title>
</head>

<body>

	<h1>Store product</h1>

	<h1><s:message code="productstorage.storage" /></h1>
	<form:form action="ProductStore.html">
		<fieldset>
			<label><s:message code="productstorage.product.name" /></label><input type="text" name="product_name" />
			<label><s:message code="productstorage.product.expirationdate" /></label><input type="date" name="product_expiration_date" />
			<label><s:message code="productstorage.product.quantity" /></label><input type="number" name="product_quantity" />
		</fieldset>
	<input type="submit" value="productstorage.storage.buttonlistproduct" value="productstorage.product.store_product" />
	</form:form>

</body>
</html>