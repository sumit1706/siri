package com.fyp.siri.models;
import jakarta.persistence.*;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@Column(name="doctor_id")
	private Integer doctorId;
	private String name;
	private String department;
	private int experience;
	private long phone;
	private String email;
	
	public Doctor() {
		super();
	}
	public Doctor(Integer doctorId, String name, String department, int experience, long phone, String email) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.department = department;
		this.experience = experience;
		this.phone = phone;
		this.email = email;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
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
