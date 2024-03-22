package com.voya.training;

public class TwoDim {
	
	public static void main(String[] args) {
		
		int[][] marks=new int[3][2];
		
		marks[0][0]=10;
		marks[0][1]=20;
		marks[1][0]=30;
		marks[1][1]=40;
		marks[2][0]=50;
		marks[2][1]=60;
		
		for (int i=0; i<marks.length; i++) {
			
			for(int j=0; j<marks[i].length; j++) {
				System.out.println(marks[i][j]);
			}
			//System.out.println();
		}
		for(int[] one :marks) {
			for(int num :one) {
				System.out.println(num);
			}
		}
		
		
	
	}

}
