<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.bext.lab.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Acceso Autorizado</title>
</head>
<body>
<h3>Acceso Autorizado.</h3>

<jsp:useBean id="User" class="org.bext.lab.dto.User" scope="request">
  <jsp:setProperty property="*" name="User" />
</jsp:useBean>

Usando JSTL... jsp:useBean jsp:getProperty<br/>
Bienvenido <jsp:getProperty property="userName" name="User"/><br/>
Direccion 1: <jsp:getProperty property="direccion1" name="User"/><br/>
Direccion 2: <jsp:getProperty property="direccion2" name="User"/><br/>
Ciudad: <jsp:getProperty property="ciudad" name="User"/><br/>
Estado: <jsp:getProperty property="estado" name="User"/><br/>
Código Postal: <jsp:getProperty property="CP" name="User"/><br/>
</body>
</html>