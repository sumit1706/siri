package com.fyp.siri.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.fyp.siri.models.Appointment;
import com.fyp.siri.models.Doctor;

@Service
public class DoctorServImpl implements DoctorServ{
	
	private ArrayList<Doctor> doctorArr = new ArrayList<Doctor>();
	
	@Override
	public Doctor addDoctor(Doctor doctor) {
		doctorArr.add(doctor);
		return doctorArr.get(doctorArr.size()-1);
	}

	@Override
	public Doctor viewDoctor(String doctorId) {
		for(Doctor doctor : doctorArr) {
			if(doctorId.equals(doctor.getDoctorId()))
				return doctor;
		}
		return null;
	}

	@Override
	public Doctor deleteDoctor(String doctorId) {
		for(Doctor doctor : doctorArr) {
			if(doctorId.equals(doctor.getDoctorId())) {
				doctorArr.remove(doctor);
				return doctor;
			}
		}
		return null;
	}

	@Override
	public Doctor updateDoctor(String doctorId, Doctor doctor) {
		for(Doctor doc : doctorArr) {
			if(doctorId.equals(doc.getDoctorId())) {
				doctorArr.remove(doc);
				doctorArr.add(doctor);
				return doctor;
			}
		}
		return null;
	}

	@Override
	public Appointment viewAppointments(String doctorId) {
		
		return null;
	}

	@Override
	public Appointment deleteAppointment(String appointmentId) {
		
		return null;
	}

}
