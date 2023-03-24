package com.fyp.siri.services;

import java.util.ArrayList;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Patient;

public interface PatientServ {
	
	public Patient addPatient(Patient patient);
	
	public ArrayList<Patient> viewPatient();
	
	public Patient viewPatient(String patientId);
	
	public Patient deletePatient(String patientId);
	
	public Patient updatePatient(String patientId, Patient patient);
	
	public Appointment bookAppointment(String patientId, Appointment appointment);
	
	public Appointment viewAppointments(String patientId);
	
	public Appointment deleteAppointment(String appointmentId);	
	
}
