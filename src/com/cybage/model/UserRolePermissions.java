package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role_permissions")
public class UserRolePermissions
{  	
	@Id
	int up_id;
	String r_name;
	String p_name;
	public UserRolePermissions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRolePermissions( String r_name, String p_name) {
		super();

		this.r_name = r_name;
		this.p_name = p_name;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getP_name() {
		return p_name;
	}
	@Override
	public String toString() {
		return "UserRolePermissions [id=" + up_id + ", r_name=" + r_name + ", p_name=" + p_name + "]";
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}



}
