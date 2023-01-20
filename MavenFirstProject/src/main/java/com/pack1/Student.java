package com.pack1;
import javax.persistence.Entity;
import javax.persistence.Id;
//@Entity(name="student_details")
@Entity
public class Student {
	@Id
	private int rollNumber;
	private String name;
	private String email;
	private String course;
	public Student(int rollNumber,String name,String email,String course)
	{
		super();
		this.rollNumber=rollNumber;
		this.name=name;
		this.email=email;
		this.course=course;
	}
	public Student()
	{
		super();
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getCourse() {
		return course;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
