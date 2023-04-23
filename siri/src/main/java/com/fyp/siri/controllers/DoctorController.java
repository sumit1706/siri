package com.fyp.siri.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Doctor;
import com.fyp.siri.services.DoctorServ;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorServ doctorServ;
	
	@GetMapping("/viewDoctor/{doctorId}")
	public Optional<Doctor> viewDoctor(@PathVariable Integer doctorId) {
		return doctorServ.viewDoctor(doctorId);
	}
	
	@GetMapping("/viewDoctor")
	public ArrayList<Doctor> viewDoctor() {
		return doctorServ.viewDoctor();
	}
	
	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorServ.addDoctor(doctor);
	}
	
	@PutMapping("/updateDoctor/{doctorId}")
	public Doctor updateDoctor(@PathVariable Integer doctorId , @RequestBody Doctor doctor) {
		return doctorServ.updateDoctor(doctorId, doctor);
	}
	
	@DeleteMapping("/deleteDoctor/{doctorId}")
	public boolean deleteDoctor(@PathVariable Integer doctorId) {
		return doctorServ.deleteDoctor(doctorId);
	}
	
	@GetMapping("/viewAppointments/{doctorId}")
	public Appointment viewAppointments(@PathVariable Integer doctorId) {
		return doctorServ.viewAppointments(doctorId);
	}
	
	@DeleteMapping("/deleteDoctorAppointment/{appointmentId}")
	public Appointment deleteAppointment(@PathVariable Integer appointmentId) {
		return doctorServ.deleteAppointment(appointmentId);
	}

}
