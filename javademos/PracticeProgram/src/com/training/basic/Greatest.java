package com.training.basic;

public class Greatest {
	public static void main(String[] args) {
		int numbers[]= {10,50,30,20};
		int greatest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>greatest)
				greatest=numbers[i];
		}
		System.out.println("Largest number :"+greatest);
	}

}
