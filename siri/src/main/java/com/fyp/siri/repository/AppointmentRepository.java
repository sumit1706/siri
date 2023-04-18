package com.fyp.siri.repository;

import org.springframework.data.repository.CrudRepository;

import com.fyp.siri.models.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {

}
