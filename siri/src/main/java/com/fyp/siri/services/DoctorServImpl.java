package com.fyp.siri.services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Doctor;
import com.fyp.siri.repository.DoctorRepository;

@Service
public class DoctorServImpl implements DoctorServ{
	
	private DoctorRepository docRepo;
//	private AppointmentRepository appRepo;
	
	@Override
	public Doctor addDoctor(Doctor doctor) {
		docRepo.save(doctor);
		return doctor;
	}

	@Override
	public Optional<Doctor> viewDoctor(Integer doctorId) {
		return docRepo.findById(doctorId);
	}

	@Override
	public boolean deleteDoctor(Integer doctorId) {
		docRepo.deleteById(doctorId);
		return true;
	}

	@Override
	public Doctor updateDoctor(Integer doctorId, Doctor doctor) {
		docRepo.deleteById(doctorId);
		return docRepo.save(doctor);
	}

	@Override
	public Appointment viewAppointments(Integer doctorId) {
		return null;
	}

	@Override
	public Appointment deleteAppointment(Integer appointmentId) {
		return null;
	}

}
