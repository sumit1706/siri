package com.fyp.siri.services;

import java.util.ArrayList;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Patient;

@Service
public class PatientServImpl implements PatientServ {

	private ArrayList<Patient> patientArr = new ArrayList<Patient>();
	private ArrayList<Appointment> appointmentArr = new ArrayList<Appointment>();
	private PasswordEncoder encoder;
	
	@Override
	public Patient addPatient(Patient patient) {
		this.encoder = new BCryptPasswordEncoder();
		String encodedPassword = this.encoder.encode(patient.getPassword());
		patient.setPassword(encodedPassword);
		patientArr.add(patient);
		return patientArr.get(patientArr.size()-1);
	}
	
	@Override
	public ArrayList<Patient> viewPatient() {
		return patientArr;
	}

	@Override
	public Patient viewPatient(String email) {
		for(Patient patient : patientArr) {
			if(email.equals(patient.getEmail()))
				return patient;
		}
		return null;
	}

	@Override
	public Patient deletePatient(String email) {
		for(Patient patient : patientArr) {
			if(email.equals(patient.getEmail())) {
				patientArr.remove(patient);
				return patient;
			}
		}
		return null;
	}

	@Override
	public Patient updatePatient(String email, Patient patient) {
		for(Patient pat : patientArr) {
			if(email.equals(pat.getEmail())) {
				patientArr.remove(pat);
				patientArr.add(patient);
				return patient;
			}
		}
		return null;
	}

	@Override
	public Appointment bookAppointment(String email, Appointment appointment) {
		appointmentArr.add(appointment);
		return appointmentArr.get(appointmentArr.size()-1);
	}

	@Override
	public Appointment viewAppointments(String email) {
		for(Appointment appointment : appointmentArr) {
			if(email.equals(appointment.getPatientEmail()))
				return appointment;
		}
		return null;
	}

	@Override
	public Appointment deleteAppointment(String appointmentId) {
		for(Appointment appointment : appointmentArr) {
			if(appointmentId.equals(appointment.getAppointmentId())) {
				appointmentArr.remove(appointment);
				return appointment;
			}
		}
		return null;
	}

}
