package com.fyp.siri.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.fyp.siri.models.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {

	ArrayList<Appointment> findByPatientEmail(String email);

}
