package com.secondCache;
import java.util.Random;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Department {
	@Id
	private int id;
	private String name;
	private int NumberOfEmployees;
	public Department()
	{
		super();
		this.id=new Random().nextInt(1000);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}
	
}
