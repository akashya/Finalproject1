package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_group_permissions")
public class UserGroupPermissions {
	@Id
	int id;
	String g_name;
	String p_name;
	public UserGroupPermissions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserGroupPermissions(String g_name, String p_name) {
		super();
		this.g_name = g_name;
		this.p_name = p_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}



}
