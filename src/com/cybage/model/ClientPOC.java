package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="client_poc")
public class ClientPOC
{

	public int poc_id;
	@Id
	private String u_name;
	private String c_name;
	private String u_contact;
	public ClientPOC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientPOC(String u_name, String c_name, String u_contact) {
		super();
		this.u_name = u_name;
		this.c_name = c_name;
		this.u_contact = u_contact;
	}

	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getU_contact() {
		return u_contact;
	}

	public void setU_contact(String u_contact) {
		this.u_contact = u_contact;
	}

	@Override
	public String toString() {
		return "ClientPOC [u_name=" + u_name + ", c_name=" + c_name
				+ ", u_contact=" + u_contact + "]";
	}


}
