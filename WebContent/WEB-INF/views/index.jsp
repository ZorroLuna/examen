<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aministraci&oacute;n de Productos</title>
</head>
<body>
<div align="center">
    <h2>Customer Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">New Customer</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>Item</th>
            <th>Nombre</th>
            <th>Cantidad</th>
            <th>C&oacute;digo</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listProduct}" var="customer">
        <tr>
            <td>${producto.item}</td>
            <td>${producto.nombre}</td>
            <td>${producto.cantidad}</td>
            <td>${producto.codigo}</td>
            <td>
                <a href="/edit?id=${producto.item}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/delete?id=${producto.item}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>