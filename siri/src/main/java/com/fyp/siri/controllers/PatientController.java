package com.fyp.siri.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Order;
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
	
	@PostMapping("/bookAppointments/{email}")
	public Appointment bookAppointment(@PathVariable String email, @RequestBody Appointment appointment) {
		System.out.println(appointment.toString());
		return patientServ.bookAppointment(appointment);
	}
	
	@GetMapping("/viewAppointments/{email}")
	public ArrayList<Appointment> viewAppointments(@PathVariable String email) {
		return patientServ.findAppointments(email);
	}
	
	@DeleteMapping("/deletePatientAppointment/{appointmentId}")
	public boolean deleteAppointment(@PathVariable Integer appointmentId) {
		return patientServ.deleteAppointment(appointmentId);
	}
	
	@PostMapping("/placeOrder")
	public String placeOrder(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("phone") long phone, @RequestParam("email") String email, @RequestParam("file") MultipartFile file) throws IOException {
		Order order = new Order();
		order.setName(name);
		order.setAddress(address);
		order.setPhone(phone);
		order.setEmail(email);
		order.setImage(file.getBytes());
		return patientServ.placeOrder(order);
	}
}
