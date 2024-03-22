package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	
	private String studName;
	private String studDept;
	private Course course;
	
	//Here course will be injected using constructor
	//Annotation autowired not required
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	public String getStudName() {
		return studName;
	}
	@Value("${student.studName}")
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudDept() {
		return studDept;
	}
	@Value("${student.studeDept}")
	public void setStudDept(String studDept) {
		this.studDept = studDept;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", studDept=" + studDept + ", course=" + course + "]";
	}
	
	
	

}
