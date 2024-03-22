package com.voya.training;

public class DoWhileEx {
	
	public static void main(String[] args) {
		  
		int x=0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println();
		
		do {
			System.out.println(x);
			x--;
		}
		while(x>0);
	}

}
