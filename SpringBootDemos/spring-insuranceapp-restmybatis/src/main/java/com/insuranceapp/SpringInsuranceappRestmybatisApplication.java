package com.insuranceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;
import com.insuranceapp.service.IInsuranceService;

@SpringBootApplication
public class SpringInsuranceappRestmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestmybatisApplication.class, args);
	}
    
	//@Autowired
	//IInsuranceService insuranceService;
	//@Override
	//public void run(String... args) throws Exception {
  // Insurance insurance=new Insurance(100,"HV0-H001","Voya","Health",12,200000);
  // insuranceService.addInsurance(insurance);
 // Insurance insurance=new Insurance(103,"F0-D01","Voya","Retirement",15,80000);
  // insuranceService.addInsurance(insurance);
//	}

}
