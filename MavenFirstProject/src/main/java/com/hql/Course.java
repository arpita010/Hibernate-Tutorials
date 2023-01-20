package com.hql;
import java.util.Random;

import javax.persistence.*;
@Entity
public class Course {
	@Id
	private int cid;
	@Column(name="CourseName")
	private String name;
	@Column(name="CourseDuration")
	private String duration;
	
	public Course()
	{
		super();
		this.cid=new Random().nextInt(1000);
	}
	public Course(String name,String duration)
	{
		super();
		this.cid=new Random().nextInt(10000);
		this.name=name;
		this.duration=duration;
	}
	public int getCid() {
		return cid;
	}
	public String getName() {
		return name;
	}
	public String getDuration() {
		return duration;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
