package com.oops.basics;

public class EmpMain {
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.employeeName="Sima";
		employee.employeeId=10;
		employee.salary=2000.5;
		
		System.out.println("Name:"+employee.employeeName);
		System.out.println("Id:"+employee.employeeId);
		System.out.println("Salary:"+employee.salary);
	
	
	 Employee employee2=new Employee();
	 employee2.employeeName="Suma";
	 employee2.employeeId=20;
	 employee2.salary=377.7;
	 
	 System.out.println("Name:"+employee2.employeeName);
		System.out.println("Id:"+employee2.employeeId);
		System.out.println("Salary:"+employee2.salary);
	}

}
