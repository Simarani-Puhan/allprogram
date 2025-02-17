package com.doctorapp.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

@Controller
public class DoctorController {
	
	@Autowired
	private IDoctorService doctorService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Doctor>doctors=doctorService.getAll();
		model.addAttribute("doctors", doctors);
		return "home";
	}
	@RequestMapping("/addDoctor")
    public String addDoctor(Doctor doctor) {
    	doctorService.addDoctor(doctor);
    	return "admin";
    }
	
	@RequestMapping("/editDoctor")
    public String editDoctor(@RequestParam("doctorId")int doctorId,Model model) throws IdNotFoundException, SQLException  {
    	Doctor doctor=doctorService.getById(doctorId);
    	model.addAttribute("doctor", doctor);
    	return "updateDoctorForm";
    }
	@RequestMapping("/updateDoctor")
    public String updateDoctor(@RequestParam("doctorId")int doctorId,@RequestParam("fees")double fees,Model model)  {
    	doctorService.updateDoctor(doctorId,fees);
    	model.addAttribute("message", "doctor updated successfully");
    	return "admin";
    }
	@RequestMapping("/deleteDoctor")
    public String deleteDoctor(@RequestParam("doctorId")int doctorId,Model model)  {
    	doctorService.deleteDoctor(doctorId);
    	model.addAttribute("message", "doctor deleted successfully");
    	return "admin";
    }
	@RequestMapping("/search")
    public String search(@RequestParam("choice")String choice,Model model) {
    	List<Doctor>doctors=doctorService.getBySpeciality(choice);
    	model.addAttribute("doctors", doctors);
    	return "home";
    }
}
