package com.voya.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private int capacity;
	private String type;
	
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCapacity() {
		return capacity;
	}
	@Value("1234")
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	@Value("Escape")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
	

}
