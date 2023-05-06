package com.fyp.siri.models;

import java.sql.Time;
import java.util.Arrays;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="`order`")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;
	private Date date;
	private Time time;
	private String name;
	private String address;
	private long phone;
	private String email;
	@Lob
	private byte[] file;
	
	public Order() {
		super();
	}
	public Order(String name, String address, long phone, String email, byte[] file) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.file = file;
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
	
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", image=" + Arrays.toString(file) + "]";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
}
