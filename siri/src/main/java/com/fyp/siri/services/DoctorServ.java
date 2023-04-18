package com.fyp.siri.services;

import java.util.Optional;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Doctor;

public interface DoctorServ {
	
	public Doctor addDoctor(Doctor doctor);
	
	public Optional<Doctor> viewDoctor(Integer doctorId);
	
	public boolean deleteDoctor(Integer doctorId);
	
	public Doctor updateDoctor(Integer doctorId, Doctor doctor);
	
	public Appointment viewAppointments(Integer doctorId);
	
	public Appointment deleteAppointment(Integer appointmentId);
	
}