package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="group1")
public class UserGroup 
{
	@Id
	private String g_name;
	private String g_desc;
	private String g_status;
	public UserGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserGroup(String g_name, String g_desc, String g_status) {
		super();
		this.g_name = g_name;
		this.g_desc = g_desc;
		this.g_status = g_status;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_desc() {
		return g_desc;
	}
	public void setG_desc(String g_desc) {
		this.g_desc = g_desc;
	}
	public String getG_status() {
		return g_status;
	}
	public void setG_status(String g_status) {
		this.g_status = g_status;

	}
	@Override
	public String toString() {
		return "UserGroup [g_name=" + g_name + ", g_desc=" + g_desc + ", g_status=" + g_status + "]";
	}



}
