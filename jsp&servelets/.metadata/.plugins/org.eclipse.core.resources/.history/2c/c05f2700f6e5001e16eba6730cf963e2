package com.doctorApp.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorApp.exception.IdNotFoundException;
import com.doctorApp.model.Doctor;
import com.doctorApp.service.DoctorServiceImpl;
import com.doctorApp.service.IDoctorService;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/editServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    IDoctorService doctorService=new DoctorServiceImpl();
    Doctor doctor=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int doctorId=Integer.parseInt(request.getParameter("doctoId"));
		
			try {
				doctor=doctorService.getById(doctorId);
				if(doctor!=null) {
					request.setAttribute("doctor", doctor);
					RequestDispatcher dispatcher=request.getRequestDispatcher("updateDoc.jsp");
					dispatcher.forward(request, response);
				}
			} catch (IdNotFoundException | SQLException e) {
				throw new RuntimeException();
			}
	
			
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
