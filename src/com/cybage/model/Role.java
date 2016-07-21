package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Role 
{
	@Id
	private String r_name;
	private String r_desc;
	private String r_status;
	public Role(String r_name, String r_desc, String r_status) {
		super();
		this.r_name = r_name;
		this.r_desc = r_desc;
		this.r_status = r_status;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_desc() {
		return r_desc;
	}
	public void setR_desc(String r_desc) {
		this.r_desc = r_desc;
	}
	public String getR_status() {
		return r_status;
	}
	public void setR_status(String r_status) {
		this.r_status = r_status;
	}
	@Override
	public String toString() {
		return "Role [r_name=" + r_name + ", r_desc=" + r_desc + ", r_status=" + r_status + "]";
	}



}
