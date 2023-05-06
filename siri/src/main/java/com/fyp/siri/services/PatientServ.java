package com.fyp.siri.services;

import java.util.ArrayList;
import java.util.Optional;


import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Order;
import com.fyp.siri.models.Patient;
import com.fyp.siri.models.User;
import com.fyp.siri.models.UserProfile;

public interface PatientServ {
	
	public Patient addPatient(Patient patient);
	
	public ArrayList<Patient> viewPatient();
	
	public Optional<Patient> viewPatient(String email);
	
	public boolean deletePatient(String email);
	
	public Patient updatePatient(String email, Patient patient);
	
	public boolean loginPatient(User user);
	
	public Appointment bookAppointment(Appointment appointment);
	
	public boolean deleteAppointment(Integer appointmentId);	
	
	public ArrayList<Appointment> findAppointments(String email);
	
	public String placeOrder(Order order);

	public UserProfile userProfile(String email);
	
}
