package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
@Service
public class InsuranceServiceImpl implements IInsuranceService{

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		return null ;
	}

	@Override
	public Insurance getById(int insuranceId) {
		List<Insurance>insurances=getAllInsurance();
		for(Insurance insurance:insurances) {
			if(insurance.getInsuranceId()==insuranceId)
				return insurance;
		}
		return null;
	}
	
	private List<Insurance>getAllInsurance(){
		return Arrays.asList(new Insurance(101, "V0-H001","Voya" , "Health", 10, 10000),
				             new Insurance(102, "BJ-M01","Bajaj" , "motor", 10, 20000),
				             new Insurance(103, "FI-Life","Fieldlity" , "life", 10, 8000),
				              new Insurance(104, "V0-H002","Voya" , "Retirement", 10, 10000));
	}

}
