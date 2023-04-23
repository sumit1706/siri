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
import com.fyp.siri.models.Patient;
import com.fyp.siri.models.User;
import com.fyp.siri.services.PatientServ;

@RestController
public class PatientController {

	@Autowired
	private PatientServ patientServ;
	
	@GetMapping("/viewPatient/{email}")
	public Optional<Patient> viewDoctor(@PathVariable String email) {
		return patientServ.viewPatient(email);
	}
	
	@GetMapping("/viewPatient")
	public ArrayList<Patient> viewDoctor() {
		return patientServ.viewPatient();
	}
	
	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientServ.addPatient(patient);
	}
	
	@PostMapping("/loginPatient")
	public boolean loginPatient(@RequestBody User user) {
		return patientServ.loginPatient(user);
	}
	
	@PutMapping("/updatePatient/{email}")
	public Patient updatePatient(@PathVariable String email , @RequestBody Patient patient) {
		return patientServ.updatePatient(email, patient);
	}
	
	@DeleteMapping("/deletePatient/{email}")
	public boolean deletePatient(@PathVariable String email) {
		return patientServ.deletePatient(email);
	}
	
	@PostMapping("/bookAppointments/{patientId}")
	public Appointment bookAppointment(@PathVariable String patientId, @RequestBody Appointment appointment) {
		return patientServ.bookAppointment(appointment);
	}
	
	@GetMapping("/viewAppointments/{patientId}")
	public ArrayList<Appointment> viewAppointments(@PathVariable String patientId) {
		return patientServ.findAppointments(patientId);
	}
	
	@DeleteMapping("/deletePatientAppointment/{appointmentId}")
	public boolean deleteAppointment(@PathVariable Integer appointmentId) {
		return patientServ.deleteAppointment(appointmentId);
	}
	
}
