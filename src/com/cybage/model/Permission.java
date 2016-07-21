package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Permission
{
	@Id
	private String p_name;
	private String p_desc;
	private String p_type;
	private String p_status;
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permission(String p_name, String p_desc, String p_type,
			String p_status) {
		super();
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.p_type = p_type;
		this.p_status = p_status;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_desc() {
		return p_desc;
	}
	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getP_status() {
		return p_status;
	}
	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
	@Override
	public String toString() {
		return "Permission [p_name=" + p_name + ", p_desc=" + p_desc
				+ ", p_type=" + p_type + ", p_status=" + p_status + "]";
	}


}
