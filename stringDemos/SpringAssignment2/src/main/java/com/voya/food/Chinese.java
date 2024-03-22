package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		System.out.println("Chinese food :");
		List<String>chinese=Arrays.asList("Gobi Manchurian","Chowmein");
		return chinese;
	}

	

}
