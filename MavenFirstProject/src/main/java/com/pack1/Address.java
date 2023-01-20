package com.pack1;

import java.util.Date;
import javax.persistence.*;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aId")
	private int addressId;
	
	@Column(length=50,name="STREET")
	private String street;
	
	
	@Column(length=100,name="CITY")
	private String city;
	@Column(name="Open")
	private boolean isOpen;
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	
	
	public int getAddressId() {
		return addressId;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public double getX() {
		return x;
	}
	public Date getDate() {
		return date;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
