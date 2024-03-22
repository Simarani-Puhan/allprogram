package com.doctorApp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorApp.model.Doctor;
import com.doctorApp.service.DoctorServiceImpl;
import com.doctorApp.service.IDoctorService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    IDoctorService doctorService=new DoctorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorName=request.getParameter("doctorName");
		int doctorId=Integer.parseInt(request.getParameter("doctorId"));
		String speciality=request.getParameter("speciality");
		double fees=Double.parseDouble(request.getParameter("fees"));
		int ratings=Integer.parseInt(request.getParameter("ratings"));
		int experience=Integer.parseInt(request.getParameter("experience"));
		
		
		Doctor doctor=new Doctor(doctorId,doctorName,speciality,fees,ratings,experience);
		doctorService.updateDoctor(doctorId, fees);
		RequestDispatcher dispatcher=request.getRequestDispatcher("adminDash.jsp") ;
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
