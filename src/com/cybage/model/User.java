package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User
{
	@Id
	private String u_name;
	private String gender;
	private String u_status;
	private String u_role;
	private String u_group;
	private String u_contact;
	private String u_password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String u_name, String gender, String u_status, String u_role, String u_group, String u_contact,
			String u_password) {
		super();
		this.u_name = u_name;
		this.gender = gender;
		this.u_status = u_status;
		this.u_role = u_role;
		this.u_group = u_group;
		this.u_contact = u_contact;
		this.u_password = u_password;
	}


	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getU_status() {
		return u_status;
	}
	public void setU_status(String u_status) {
		this.u_status = u_status;
	}
	public String getU_role() {
		return u_role;
	}
	public void setU_role(String u_role) {
		this.u_role = u_role;
	}
	public String getU_group() {
		return u_group;
	}
	public void setU_group(String u_group) {
		this.u_group = u_group;
	}

	@Override
	public String toString() {
		return "User [u_name=" + u_name + ", gender=" + gender + ", u_status=" + u_status + ", u_role=" + u_role
				+ ", u_group=" + u_group + ", u_contact=" + u_contact + ", u_password=" + u_password + "]";
	}


	public String getU_contact() {
		return u_contact;
	}

	public void setU_contact(String u_contact) {
		this.u_contact = u_contact;
	}
	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}



}
