package com.fyp.siri.models;

import java.sql.Date;
import java.util.ArrayList;

public class UserProfile {

	private String name;
	private String email;
	private String gender;
	private Date dob;
	private String address;
	private long phone;
	public ArrayList<Order> previousOrders = new ArrayList<Order>();
	public ArrayList<Appointment> previousAppointments = new ArrayList<Appointment>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", email=" + email + ", address=" + address
				+ ", phone=" + phone + ", previousOrders=" + previousOrders + ", previousAppointments="
				+ previousAppointments + "]";
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
