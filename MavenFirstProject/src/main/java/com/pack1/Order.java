package com.pack1;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Order
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OrderNumber")
	private int orderid;
	
	@Column(name="OrderName",length=100)
	private String name;
	
	@Column(name="AddressName",length=100)
	private String address;
	
	@Column(name="OrderDate")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Transient
	private int total;
	public int getOrderid() {
		return orderid;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Date getDate() {
		return date;
	}
	public int getTotal() {
		return total;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}