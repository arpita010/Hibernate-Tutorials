package com.OneToMany;
import java.util.*;
import javax.persistence.*;

@Entity
public class Parent {
	@Id
	private int parentId;
	@Column(name="FatherName")
	private String father;
	@Column(name="MotherName")
	private String mother;
//	@OneToMany
	@OneToMany(mappedBy="parent")
//	@OneToMany(mappedBy="parent",fetch=FetchType.EAGER) //for explicitly defining the type of loading
	List<Child> list;
	public int getParentId() {
		return parentId;
	}
	public String getFather() {
		return father;
	}
	public String getMother() {
		return mother;
	}
	public List<Child> getList() {
		return list;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public void setList(List<Child> list) {
		this.list = list;
	}
}
