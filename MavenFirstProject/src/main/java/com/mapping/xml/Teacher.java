package com.mapping.xml;

import java.util.Random;

public class Teacher {
	private int id;
	private String name;
	private String phone;
	public Teacher()
	{
		super();
		this.id=new Random().nextInt(1000);
	}
	public Teacher(String name,String phone)
	{
		super();
		this.id=new Random().nextInt(1000);
		this.name=name;
		this.phone=phone;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
