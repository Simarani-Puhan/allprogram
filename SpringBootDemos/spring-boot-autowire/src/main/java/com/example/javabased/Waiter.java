package com.example.javabased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;

	@Autowired
	IFoodMenu menus;

	@Autowired
	IFoodMenu menuItems;

	public IFoodMenu getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}

	public List<String> viewMenuCard(String choice) {
		List<String> menuList = new ArrayList<>();
		if (choice.equals("in"))
			menuList = iFoodMenu.showMenu();
		if (choice.equals("it"))
			menuList = menus.showMenu();
		if (choice.equals("ch"))
			menuList = menuItems.showMenu();
		return menuList;
	}

}
