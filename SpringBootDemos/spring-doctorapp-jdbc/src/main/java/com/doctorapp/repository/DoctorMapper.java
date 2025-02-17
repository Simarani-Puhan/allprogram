package com.doctorapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.doctorapp.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor>{

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor=new Doctor();
		doctor.setDoctorId(2);
		doctor.setDoctorName("Sima");
		doctor.setSpeciality("Dermatology");
		doctor.setFees(4000);
		doctor.setRatings(4);
		doctor.setExperience(6);
		return doctor;
	}

}
