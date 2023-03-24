package com.fyp.siri.models;

public class Doctor {
	
	private String doctorId;
	private String name;
	private String department;
	private int experience;
	private int phone;
	private String email;
	
	public Doctor() {
		super();
	}
	public Doctor(String doctorId, String name, String department, int experience, int phone, String email) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.department = department;
		this.experience = experience;
		this.phone = phone;
		this.email = email;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", department=" + department + ", experience=" + experience + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
}
