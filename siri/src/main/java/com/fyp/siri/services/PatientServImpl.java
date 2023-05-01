package com.fyp.siri.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Order;
import com.fyp.siri.models.Patient;
import com.fyp.siri.models.User;
import com.fyp.siri.repository.AppointmentRepository;
import com.fyp.siri.repository.OrderRepository;
import com.fyp.siri.repository.PatientRepository;

@Service
public class PatientServImpl implements PatientServ {

	private PasswordEncoder encoder;
	@Autowired
	private PatientRepository patRepo;
	@Autowired
	private AppointmentRepository appRepo;
	@Autowired
	private OrderRepository orderRepo;
	
	
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
		this.encoder = new BCryptPasswordEncoder();
		String encodedPassword = this.encoder.encode(patient.getPassword());
		patient.setPassword(encodedPassword);
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
		return appRepo.findByPatientEmail(email);
	}

	@Override
	public boolean loginPatient(User user) {
		this.encoder = new BCryptPasswordEncoder();
		if(patRepo.existsById(user.getEmail())) {
			Patient curPatient = patRepo.findByEmail(user.getEmail());
			if(curPatient!= null && encoder.matches(user.getPassword(), curPatient.getPassword()))
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String placeOrder(Order order) {
		try {
			orderRepo.save(order);
			return "Order Placed Sucessfully";
		}
		catch(Exception e){
			return e.toString();
		}
	}
		
}
