package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_offices")
public class ClientOffices
{
	@Id
	private int office_id;
	private String c_name;
	private String location;
	private String address;
	public ClientOffices()
	{
		super();
	}
	public ClientOffices(String c_name, String location, String address) {
		super();
		this.c_name = c_name;
		this.location = location;
		this.address = address;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ClientOffices [c_name=" + c_name + ", location=" + location
				+ ", address=" + address + "]";
	}


}
