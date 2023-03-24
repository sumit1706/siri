package com.fyp.siri.models;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
	
	private String appointmentId;
	private String patientEmail;
	private String doctorId;
	private Date date;
	private Time time;
	
	public Appointment() {
		super();
	}
	
	public Appointment(String appointmentId, String patientEmail, String doctorId, Date date, Time time) {
		super();
		this.appointmentId = appointmentId;
		this.patientEmail = patientEmail;
		this.doctorId = doctorId;
		this.date = date;
		this.time = time;
	}
	
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	public String getPatientEmail() {
		return patientEmail;
	}
	
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
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
