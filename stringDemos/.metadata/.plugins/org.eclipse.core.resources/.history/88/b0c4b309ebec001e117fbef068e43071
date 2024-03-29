package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
@Component
public class AppUserMapper {
	
	public AppUser convertToAppUser(UserDetails userDetails) {
		String userName=userDetails.getUsername();
		String password=userDetails.getPassword();
		    AppUser appUser=new AppUser();
			appUser.setUserName(userName);
			appUser.setPassword(password);
			return appUser;
				
	}	
			public UserDetails convertToAppUser(AppUser appUser) {
				String userName=appUser.getUserName();
				String password=appUser.getPassword();
           List<GrantedAuthority>authorities=new ArrayList<>();
           
           List<String>roles=Arrays.asList("user","admin");
           for(String role:roles) {
        	   SimpleGrantedAuthority simpleAuthority=new SimpleGrantedAuthority(role);
        	   authorities.add(simpleAuthority);
        	   
           }
           
           UserDetails details=new User(userName,password,authorities);
           
		return details;			
           
           
	}

}
