package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Traingle implements Shape{

	@Override
	public void area(int x, int y) {
   
       System.out.println("Area of traingle :"+0.5*x*y);
	}


	
	
	

}
