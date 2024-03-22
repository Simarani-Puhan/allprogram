package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.nextLine();
		//String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println(id);
		
		System.out.println("Enter city");
		//String city=sc.next();
		String city=sc.nextLine();
		sc.nextLine();
		System.out.println(city);
		
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		System.out.println(salary);
		
		sc.close();

	}

}
