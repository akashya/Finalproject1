package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_domain")
public class ClientDomains 
{
	@Id
	private int domain_id;
	private String c_name;
	private String domain_name;


	public ClientDomains() 
	{
		super();
	}
	public ClientDomains(String c_name, String domain_)
	{
		super();
		this.c_name = c_name;
		this.domain_name = domain_;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getDomain_name() {
		return domain_name;
	}
	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}
	@Override
	public String toString() {
		return "ClientDomain [c_name=" + c_name + ", domain_name="
				+ domain_name + "]";
	}


}
