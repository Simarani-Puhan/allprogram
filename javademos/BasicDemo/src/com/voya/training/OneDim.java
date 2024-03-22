package com.voya.training;

public class OneDim {

	public static void main(String[] args) {
                
		int[] marks=new int[4];
		System.out.println(marks[0]);//0
		System.out.println(marks.length);//4
		
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		marks[3]=40;
		
		
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		
		for(int mark:marks)
			System.out.println(mark);
		
	}

}
