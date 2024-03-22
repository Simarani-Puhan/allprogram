package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exceptions.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;
@Service
public class InsuranceServiceImpl implements IInsuranceService{
    @Autowired
    IInsuranceRepository insuranceRepository;
    
	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.addInsurance(insurance);		
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		insuranceRepository.updateInsurance(insuranceId, premium);		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteInsurance(insuranceId);		
	}

	@Override
	public List<Insurance> getAll() {
		List<Insurance>insurances=insuranceRepository.findAll();
		return insurances;
	}

	@Override
	public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
    List<Insurance>insurances=insuranceRepository.findByBrand(brand);
		return insurances;
	}

	@Override
	public List<Insurance> getBrandAndType(String brand, String type) throws InsuranceNotFoundException {
   List<Insurance>insurances=insuranceRepository.findBrandAndType(brand, type);
		return insurances;
	}

	@Override
	public List<Insurance> getByTypeAndLesserPremium(String brand, double premium) throws InsuranceNotFoundException {
List<Insurance>insurances=insuranceRepository.findByTypeAndLesserPremium(brand, premium);
		return insurances;
	}

	@Override
	public Insurance getById(int insuranceId) throws InsuranceNotFoundException {
	Insurance insurances=	insuranceRepository.findById(insuranceId);
		return insurances;
	}

	
}
