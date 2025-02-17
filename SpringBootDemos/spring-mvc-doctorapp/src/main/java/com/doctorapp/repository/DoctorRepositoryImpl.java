package com.doctorapp.repository;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.Queries;
import com.doctorapp.util.DoctorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class DoctorRepositoryImpl implements IDoctorRepository {
	
	private JdbcTemplate jdbcTemplate;

	public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

    @Override
    public void addDoctor(Doctor doctor) { 
    	Object[] docArr = {doctor.getDoctorName(), doctor.getSpeciality(),doctor.getExperience(),doctor.getRatings(),doctor.getFees()};
		jdbcTemplate.update(Queries.INSERTQUERY, docArr);
    }
    @Override
    public void updateDoctor(int doctorId, double fees) {
    	jdbcTemplate.update(Queries.UPDATEQUERY,fees, doctorId);
    }

    @Override
    public void deleteDoctor(int doctorId) {
    	jdbcTemplate.update(Queries.DELETEQUERY, doctorId);
    }

    @Override
    public Doctor findById(int doctorId) throws SQLException {

    	Doctor doctor=jdbcTemplate.queryForObject(Queries.FINDBYIDQUERY,new DoctorMapper(),doctorId);
		return doctor;
    }
    @Override
    public List<Doctor> findAll() {
    	RowMapper<Doctor> mapper = new DoctorMapper();
		List<Doctor> doctors = jdbcTemplate.query(Queries.FINDALLQUERY, mapper);
		return doctors;
    }
    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITYQUERY);
        ) {
            statement.setString(1, speciality);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int ratings = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    Double fees = resultSet.getDouble("fees");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    // doctor.setDoctorId(resultSet.getString("doctor_id"));
                    doctor.setDoctorId(doctorId);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);
                    doctorList.add(doctor);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }
    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEXQUERY)
        ) {
            statement.setString(1, speciality);
            statement.setInt(2, experience);
            try (ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_Name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }
    @Override
    public List<Doctor> findBySpecialityAndLessfees(String speciality, double fees) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEXQUERY)
        ) {
            statement.setString(1, speciality);
            statement.setDouble(2, fees);
            try (ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_Name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }
    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEXQUERY)
        ) {
            statement.setString(1, speciality);
            statement.setInt(2, ratings);
            try (ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_Name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }
    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAMEQUERY)
        ) {
            statement.setString(1, speciality);
            statement.setString(2, "%" + doctorName + "%");
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_Name"));
                    doctor.setDoctorId(resultSet.getInt("doctor_Id"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }
}