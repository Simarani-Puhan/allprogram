package com.training.basic;

public class Smallest {
	
	public static void main(String[] args) {
		int numbers[]= {57,64,10,73,23};
		int smallest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]<smallest)
				smallest=numbers[i];
			
			
		}
		System.out.println("Smallest Number :"+smallest);
	}

}
