package com.doctorapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
	@Autowired
	IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		/*List<Doctor>doctors=doctorService.getAll();
		for(Doctor doctor:doctors) {
			System.out.println(doctor);*/
		
		
		/*
		 * Doctor doctor=new Doctor("Roma","Neuro",200,4,7);
		 * doctorService.addDoctor(doctor);
		 */
		 
		 	
			System.out.println(doctorService.getById(2));
	      

}
}