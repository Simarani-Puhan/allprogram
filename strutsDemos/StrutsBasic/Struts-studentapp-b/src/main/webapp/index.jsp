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
  <s:form action="show">
  <s:text-field name="student.studName" label="StudentName"></s:text-field>
  <s:text-field name="student.studId" label="StudentId"></s:text-field>
  <s:text-field name="student.studDept" label="StudentDept"></s:text-field>
  <s:submit value="submit"></s:submit>
  </s:form>

</body>
</html>