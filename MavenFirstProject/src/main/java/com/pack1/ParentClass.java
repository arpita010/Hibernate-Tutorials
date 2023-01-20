package com.pack1;
import javax.persistence.*;
@Entity
public class ParentClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int parentId;
	private String parentName;
	private String parentPhone;
	ChildClass child1;
	public ChildClass getChild1() {
		return child1;
	}
	public void setChild1(ChildClass child1) {
		this.child1 = child1;
	}
	public int getParentId() {
		return parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	
	
}
