package com.OneToMany;
import javax.persistence.*;

@Entity
public class Child {
	@Id
	private int childId;
	private String childName;
	@ManyToOne
	@JoinColumn(name="ParentID")
	private Parent parent;
	
	public int getChildId() {
		return childId;
	}
	public String getChildName() {
		return childName;
	}
	public Parent getParent() {
		return parent;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
}
