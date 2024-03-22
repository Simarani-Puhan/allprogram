<%@page import="com.employeeapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Employee employee=(Employee)request.getAttribute("employee");
String employeeName=employee.getEmployeeName();
out.println("EmployeeName :"+employeeName+"<br>");
Integer employeeId=employee.getEmployeeId();
out.println("EmployeeId :"+employeeId+"<br>");
double salary=employee.getSalary();
out.println("Salary :"+salary+"<br>");
String city=employee.getCity();
out.println("City :"+city+"<br>");

%>
</body>
</html>