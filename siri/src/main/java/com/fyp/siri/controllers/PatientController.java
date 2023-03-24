package com.fyp.siri.controllers;

import java.util.ArrayList;

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
import com.fyp.siri.services.PatientServ;

@RestController
public class PatientController {

	@Autowired
	private PatientServ patientServ;
	
	@GetMapping("/viewPatient/{patientId}")
	public Patient viewDoctor(@PathVariable String patientId) {
		return patientServ.viewPatient(patientId);
	}
	
	@GetMapping("/viewPatient")
	public ArrayList<Patient> viewDoctor() {
		return patientServ.viewPatient();
	}
	
	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientServ.addPatient(patient);
	}
	
	@PutMapping("/updatePatient/{patientId}")
	public Patient updatePatient(@PathVariable String patientId , @RequestBody Patient patient) {
		return patientServ.updatePatient(patientId, patient);
	}
	
	@DeleteMapping("/deletePatient/{email}")
	public Patient deletePatient(@PathVariable String email) {
		return patientServ.deletePatient(email);
	}
	
	@PostMapping("/bookAppointments/{patientId}")
	public Appointment bookAppointment(@PathVariable String patientId, @RequestBody Appointment appointment) {
		return patientServ.bookAppointment(patientId, appointment);
	}
	
	@GetMapping("/viewAppointments/{patientId}")
	public Appointment viewAppointments(@PathVariable String patientId) {
		return patientServ.viewAppointments(patientId);
	}
	
	@DeleteMapping("/deletePatientAppointment/{appointmentId}")
	public Appointment deleteAppointment(@PathVariable String appointmentId) {
		return patientServ.deleteAppointment(appointmentId);
	}
	
}
