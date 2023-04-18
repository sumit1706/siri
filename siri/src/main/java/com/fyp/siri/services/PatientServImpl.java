package com.fyp.siri.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Patient;
import com.fyp.siri.repository.AppointmentRepository;
import com.fyp.siri.repository.PatientRepository;

@Service
public class PatientServImpl implements PatientServ {

	private PasswordEncoder encoder;
	private PatientRepository patRepo;
	private AppointmentRepository appRepo;
	
	
	@Override
	public Patient addPatient(Patient patient) {
		this.encoder = new BCryptPasswordEncoder();
		String encodedPassword = this.encoder.encode(patient.getPassword());
		patient.setPassword(encodedPassword);
		return patRepo.save(patient);
	}
	
	@Override
	public ArrayList<Patient> viewPatient() {
		return (ArrayList<Patient>) patRepo.findAll();
	}

	@Override
	public Optional<Patient> viewPatient(String email) {
		return patRepo.findById(email);
	}

	@Override
	public boolean deletePatient(String email) {
		patRepo.deleteById(email);
		return true;
	}

	@Override
	public Patient updatePatient(String email, Patient patient) {
		patRepo.deleteById(email);
		return patRepo.save(patient);
	}

	@Override
	public Appointment bookAppointment(Appointment appointment) {
		return appRepo.save(appointment);
	}

	@Override
	public boolean deleteAppointment(Integer appointmentId) {
		appRepo.deleteById(appointmentId);
		return true;
	}

	@Override
	public ArrayList<Appointment> findAppointments(String email) {
		return null;
	}

}
