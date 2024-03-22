package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY="insert into doctor(doctor_name,speciality,experience,ratings,fees) values(?,?,?,?,?)";
    public static final String UPDATEQUERY="UPDATE DOCTOR SET fees=? WHERE doctor_id=?";
    public static final String DELETEQUERY="DELETE FROM DOCTOR WHERE doctor_id=?";
    public static final String FINDALLQUERY="SELECT *FROM DOCTOR";
    public static final String FINDBYSPECIALITYQUERY="SELECT *FROM DOCTOR WHERE speciality=?";
    public static final String FINDBYSPECANDEXQUERY="SELECT *FROM DOCTOR WHERE speciality=? AND experience>=?";
    public static final String FINDBYSPECANDRATINGSQUERY="SELECT *FROM DOCTOR WHERE speciality=? AND ratings>=?";
    public static final String FINDBYSPECANDFEESQUERY="SELECT *FROM DOCTOR WHERE speciality=? AND fees<=?";
    public static final String FINDBYSPECANDNAMEQUERY="SELECT *FROM DOCTOR WHERE speciality=? AND doctor_name like?";
    public static final String FINDBYIDQUERY="SELECT *FROM DOCTOR WHERE doctor_id=?";


}
