package com.fyp.siri.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.query.Procedure;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Patient;
import com.fyp.siri.models.User;

public interface PatientServ {
	
	public Patient addPatient(Patient patient);
	
	public ArrayList<Patient> viewPatient();
	
	public Optional<Patient> viewPatient(String email);
	
	public boolean deletePatient(String email);
	
	public Patient updatePatient(String email, Patient patient);
	
	public boolean loginPatient(User user);
	
	public Appointment bookAppointment(Appointment appointment);
	
	public boolean deleteAppointment(Integer appointmentId);	
	
	@Procedure
	public ArrayList<Appointment> findAppointments(String email);
	
}
