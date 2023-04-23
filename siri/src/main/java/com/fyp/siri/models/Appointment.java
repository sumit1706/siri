package com.fyp.siri.models;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer appointmentId;
	@Column(name = "patient_email")
	private String patientEmail;
	@Column(name = "doctor_id")
	private Integer doctorId;
	private Date date;
	private Time time;
	
	public Appointment() {
		super();
	}

	public Appointment(String patientEmail, Integer doctorId, Date date, Time time) {
		super();
		this.patientEmail = patientEmail;
		this.doctorId = doctorId;
		this.date = date;
		this.time = time;
	}
	
	public Integer getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	public String getPatientEmail() {
		return patientEmail;
	}
	
	public Integer getDoctorId() {
		return doctorId;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patientEmail=" + patientEmail + ", doctorId=" + doctorId
				+ ", date=" + date + ", time=" + time + "]";
	}

}
