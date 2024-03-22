package org.doctorapp.repository;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.util.DoctorDB;
import org.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        //establish a connection
        //create a prepared statement
        //set values for placeholders
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());
            //call execute
            boolean result = statement.execute();
            System.out.println("One row inserted " + !result);
        } catch (Exception e) {
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {
            statement.setInt(2, doctorId);
            statement.setDouble(1, fees);
            int result = statement.executeUpdate();
            System.out.println("One row updated " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDoctor(int doctorId) {
    }

    @Override
    public Doctor findById(int doctorId) throws SQLException {

        Doctor doctor = null;

        try (
            Connection connection = DoctorDB.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYIDQUERY);)
        {
                statement.setInt(1, doctorId);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Integer doctor_id = resultSet.getInt("doctor_id");
                    String doctorName = resultSet.getString("doctor_name");
                    String speciality = resultSet.getString("speciality");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");
                    int experience = resultSet.getInt("experience");
                    doctor = new Doctor(doctor_id, doctorName, speciality, fees, ratings, experience);
                }
            }
                catch (Exception e) {
                    e.printStackTrace();
        }
        return doctor;
    }
    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
             ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                String doctorName = resultSet.getString("doctor_name");
                String speciality = resultSet.getString("speciality");
                int experience = resultSet.getInt("experience");
                int ratings = resultSet.getInt("ratings");
                int doctorId = resultSet.getInt("doctor_id");
                Double fees = resultSet.getDouble("fees");
                Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, experience, ratings);
                doctorList.add(doctor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
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