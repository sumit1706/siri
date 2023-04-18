package com.fyp.siri.models;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class Patient {

	private String name;
	@Id
	private String email;
	private String password;
	private String address;
	private long phone;
	
	
	public Patient() {
		super();
	}
	
	public Patient(String name, String email, String password,  String address, long phone) {
		super();
		this.password = password;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", email=" + email + ", password=" + password + ", address=" + address + ", phone=" + phone + "]";
	}

}
