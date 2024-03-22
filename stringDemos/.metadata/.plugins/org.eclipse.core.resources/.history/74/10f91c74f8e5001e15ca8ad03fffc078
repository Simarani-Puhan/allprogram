package com.doctorapp.client;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.DoctorServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class User {
    public static void main(String[] args) throws DoctorNotFoundException, SQLException {
        IDoctorService doctorService = new DoctorServiceImpl();
        Specialization specialization = Specialization.GYNAEC;
        String speciality = specialization.getSpeciality();
        String special = Specialization.GYNAEC.getSpeciality();
//        Doctor doctor = new Doctor("Raj", speciality, 1000, 4, 10);
//        Doctor doctor3 = new Doctor("John", speciality, 700, 3, 2);
//        Doctor doctor4 = new Doctor("Sheetal", speciality, 900, 2, 6);
//        Doctor doctor5 = new Doctor("Shalini", speciality, 500, 5, 7);
//        Doctor doctor6 = new Doctor("Sri", speciality, 600, 1, 1);
//        doctorService.addDoctor(doctor3);
//        doctorService.addDoctor(doctor4);
//        doctorService.addDoctor(doctor5);
//        doctorService.addDoctor(doctor6);
//        doctorService.addDoctor(doctor);
//        Doctor doctor1 = new Doctor("Ram", speciality, 2000, 5, 5);
//        Doctor doctor2 = new Doctor("Rita", speciality, 1500, 3, 9);
//        doctorService.updateDoctor(1, 3000);
//        doctorService.updateDoctor(2, 1500);
//        doctorService.addDoctor(doctor1);
//        doctorService.addDoctor(doctor2);
//
//        int doctorIdToDelete = 2;
//        doctorService.deleteDoctor(doctorIdToDelete);
//
        try {
            Doctor findDoctor = doctorService.getById(1);
            System.out.println(("Id :" + findDoctor));
        } catch (IdNotFoundException e) {
            System.out.println("Doctor not found with this id");
        }
        System.out.println("-----------------");
        List<Doctor> doctors = doctorService.getAll();
        System.out.println("All doctors :");
        for (Doctor doc : doctors) {
            System.out.println(doc);
        }
//        String findBySpeciality = Specialization.GYNAEC.getSpeciality();
//        try {
//            List<Doctor> doctorBySpeciality = doctorService.getBySpeciality(findBySpeciality);
//            for (Doctor doc : doctorBySpeciality) {
//                System.out.println(doc);
//            }
//        } catch (DoctorNotFoundException e) {
//            System.out.println("Doctor not found with this speciality");
//        }
//        int findByExperience = 6;
//        try {
//            List<Doctor> doctorBySpecialityAndExperience = doctorService.getBySpecialityAndExp(findBySpeciality, findByExperience);
//            for (Doctor doc : doctorBySpecialityAndExperience) {
//                System.out.println(doc);
//            }
//        } catch (DoctorNotFoundException e) {
//            System.out.println("Doctor not found with this speciality and experience");
//        }
//        double maxFees = 2000.0;
//        try {
//            List<Doctor> doctorBySpecialityAndLessFees = doctorService.getBySpecialityAndLessfees(findBySpeciality, maxFees);
//            for (Doctor doc : doctorBySpecialityAndLessFees) {
//                System.out.println(doc);
//            }
//        } catch (DoctorNotFoundException e) {
//            System.out.println("Doctor not found with this id and fees");
//        }
//        int findByRatings = 4;
//        try {
//            List<Doctor> doctorBySpecialityAndRatings = doctorService.getBySpecialityAndRatings(findBySpeciality, findByRatings);
//            for (Doctor doc : doctorBySpecialityAndRatings) {
//                System.out.println(doc);
//            }
//        } catch (DoctorNotFoundException e) {
//            System.out.println("Doctor not found with this speciality and ratings");
//        }
//
//        String findByName = "Sima";
//        try {
//            List<Doctor> doctorBySpecialityAndName = doctorService.getBySpecialityAndNameContains(findBySpeciality, findByName);
//            for (Doctor doc : doctorBySpecialityAndName) {
//                System.out.println(doc);
//            }
//        } catch (DoctorNotFoundException e) {
//            System.out.println("Doctor not found with this speciality and name");
//        }
    }
}
