package com.training.basic;

public class ReverseArray {

	public static void main(String[] args) {
           
		int ar[]= {10,20,30,40,50};
		
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
