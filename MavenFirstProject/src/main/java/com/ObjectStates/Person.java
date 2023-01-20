package com.ObjectStates;
import java.util.Random;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	private int pid;
	@Column(name="PersonName")
	private String name;
	@Column(name="UserEmail")
	private String email;
	public Person()
	{
	super();	
	}
	public Person(String name,String email)
	{
		super();
		this.pid=new Random().nextInt(100000);
		this.name=name;
		this.email=email;
	}
	
	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString()
	{
		return this.pid+" "+this.name+" "+this.email;
	}
	
}
