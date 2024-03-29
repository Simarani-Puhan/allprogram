<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="login.action">
<s:text-field name="username" label="Username"></s:text-field>
<s:text-field name="city" label="City"></s:text-field>
<s:submit value="Submit"></s:submit>
</body>
</html>