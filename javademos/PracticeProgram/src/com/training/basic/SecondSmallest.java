package com.training.basic;

public class SecondSmallest {
		public static void main(String[] args) {
			int b[]= {20,65,45,32,12};
			int temp;
			for(int i=0; i<b.length-1; i++) {
				for(int j=i+1;j<b.length; j++) {
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
	
		}
			
				System.out.println(b[b.length]);

}
}
