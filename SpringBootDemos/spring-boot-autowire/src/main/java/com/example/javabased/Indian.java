package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

public class Indian implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		System.out.println("Indian food :");
		List<String>indian=Arrays.asList("Dosa","vada");
		return indian;
	}

}
