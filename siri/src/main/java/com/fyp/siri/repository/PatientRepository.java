package com.fyp.siri.repository;

import org.springframework.data.repository.CrudRepository;

import com.fyp.siri.models.Patient;

public interface PatientRepository extends CrudRepository<Patient, String>{

	Patient findByEmail(String email);

}
