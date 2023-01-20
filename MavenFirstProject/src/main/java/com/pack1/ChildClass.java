package com.pack1;
import javax.persistence.*;

@Embeddable
public class ChildClass {
	private String childName;
	private String childPhone;
	public String getChildName() {
		return childName;
	}
	public String getChildPhone() {
		return childPhone;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public void setChildPhone(String childPhone) {
		this.childPhone = childPhone;
	}
}
