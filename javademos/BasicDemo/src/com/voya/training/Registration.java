package com.voya.training;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		
            
            String[] usernames= {"Sima", "Sheetal", "Shalini" ,"Priya"};
            Scanner sc=new Scanner(System.in);
            boolean isPresent=false;
          System.out.println("Enter name to register");
          String user=sc.next();
            
          for(String name:usernames) {
            if(name.equalsIgnoreCase(user)) {
            	System.out.println("Name already exists");
            	isPresent=true;
            	break;
            }
          }
            if(!isPresent) 
            	System.out.println("You are Registered");
            
          
	}

}
