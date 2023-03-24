package com.fyp.siri.controllers;

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
	public Doctor viewDoctor(@PathVariable String doctorId) {
		return doctorServ.viewDoctor(doctorId);
	}
	
	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorServ.addDoctor(doctor);
	}
	
	@PutMapping("/updateDoctor/{doctorId}")
	public Doctor updateDoctor(@PathVariable String doctorId , @RequestBody Doctor doctor) {
		return doctorServ.updateDoctor(doctorId, doctor);
	}
	
	@DeleteMapping("/deleteDoctor/{doctorId}")
	public Doctor deleteDoctor(@PathVariable String doctorId) {
		return doctorServ.deleteDoctor(doctorId);
	}
	
	@GetMapping("/viewAppointments/{doctorId}")
	public Appointment viewAppointments(@PathVariable String doctorId) {
		return doctorServ.viewAppointments(doctorId);
	}
	
	@DeleteMapping("/deleteDoctorAppointment/{appointmentId}")
	public Appointment deleteAppointment(@PathVariable String appointmentId) {
		return doctorServ.deleteAppointment(appointmentId);
	}

}
