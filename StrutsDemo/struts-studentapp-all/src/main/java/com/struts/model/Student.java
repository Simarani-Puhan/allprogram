package com.struts.model;

public class Student {
	private String name;
	private String city;
	private String email;
	private int age;
	private String gender;
	private String hobby;
	private String course;
	private double stipend;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getStipend() {
		return stipend;
	}
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", email=" + email + ", age=" + age + ", gender=" + gender
				+ ", hobby=" + hobby + ", course=" + course + ", stipend=" + stipend + "]";
	}
	
	

}
