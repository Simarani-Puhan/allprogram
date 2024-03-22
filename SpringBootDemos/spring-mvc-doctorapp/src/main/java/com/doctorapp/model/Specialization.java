package com.doctorapp.model;

import java.sql.PreparedStatement;
public enum Specialization {
    ORTHO("ORTHOPEDICIAN"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST");
    private String speciality;
    Specialization(String speciality){
        this.speciality=speciality;
    }
    public String getSpeciality(){
        return speciality;
    }
}
