package com.fyp.siri.models;

import java.util.Arrays;

import jakarta.persistence.*;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;
	private String name;
	private String address;
	private long phone;
	private String email;
	@Lob
	private byte[] image;
	
	public Order() {
		super();
	}
	public Order(String name, String address, long phone, String email, byte[] image) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.image = image;
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
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", image=" + Arrays.toString(image) + "]";
	}
}
