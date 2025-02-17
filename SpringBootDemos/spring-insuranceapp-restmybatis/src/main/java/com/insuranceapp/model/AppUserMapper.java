package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class AppUserMapper {
	
	private PasswordEncoder passwordEncoder;
	
	public AppUser convertToAppUser(UserDetails userDetails) {
		String userName=userDetails.getUsername();
		String password=passwordEncoder.encode (userDetails.getPassword());
		    AppUser appUser=new AppUser();
			appUser.setUserName(userName);
			appUser.setPassword(password);
			return appUser;
				
	}	
			public UserDetails convertToUserDetails(AppUser appUser) {
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
