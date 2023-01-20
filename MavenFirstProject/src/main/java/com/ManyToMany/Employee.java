package com.ManyToMany;
import java.util.*;
import javax.persistence.*;
@Entity
public class Employee {
	@Id
	private int eid;
	private String empName;
	@ManyToMany(mappedBy="emps")
	private List<Project> projects;
	public int getEid() {
		return eid;
	}
	public String getEmpName() {
		return empName;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
