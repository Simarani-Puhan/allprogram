package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction extends ActionSupport {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String execute(){
        if(student.getStudName().equals("Sima"))
            return "success";
        return "error";
    }
}
