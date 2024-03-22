package com.voya.training;

public class Greater {

	public static void main(String[] args) {
         int x=10;
         int y=20;
         int z=30;
         
         if(x<y &z<y) {
        	 System.out.println("Y is greater than X & Y");
         }
         
         else if(y<z&x<z) {
        	 System.out.println("Z is greater than Y & X");
         }
               else{
        	 System.out.println("X is greater than Y & Z");
         }
   	}

}
