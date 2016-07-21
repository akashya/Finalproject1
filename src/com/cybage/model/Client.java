package com.cybage.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Client
{
	@Id	
	String c_name;
	String c_desc;
	int c_revenue;
	String c_employees;
	String c_presence;
	String c_ceo;
	String c_cto;
	String c_status;
	String c_address;


	public Client() 
	{
		super();
	}
	public Client(String c_name, String c_desc, int c_revenue, String c_employees, String c_presence, String c_ceo,
			String c_cto, String c_status,String c_address)
	{
		super();
		this.c_name = c_name;
		this.c_desc = c_desc;
		this.c_revenue = c_revenue;
		this.c_employees = c_employees;
		this.c_presence = c_presence;
		this.c_ceo = c_ceo;
		this.c_cto = c_cto;
		this.c_status = c_status;
		this.c_address=c_address;
	}
	public String getC_address()
	{
		return c_address;
	}
	public void setC_address(String c_address)
	{
		this.c_address = c_address;
	}
	public String getC_name()
	{
		return c_name;
	}
	public void setC_name(String c_name)
	{
		this.c_name = c_name;
	}
	public String getC_desc()
	{
		return c_desc;
	}
	public void setC_desc(String c_desc)
	{
		this.c_desc = c_desc;
	}
	public int getC_revenue()
	{
		return c_revenue;
	}
	public void setC_revenue(int c_revenue)
	{
		this.c_revenue = c_revenue;
	}
	public String getC_employees()
	{
		return c_employees;
	}
	public void setC_employees(String c_employees)
	{
		this.c_employees = c_employees;
	}
	public String getC_presence()
	{
		return c_presence;
	}
	public void setC_presence(String c_presence)
	{
		this.c_presence = c_presence;
	}
	public String getC_ceo()
	{
		return c_ceo;
	}
	public void setC_ceo(String c_ceo)
	{
		this.c_ceo = c_ceo;
	}
	public String getC_cto()
	{
		return c_cto;
	}
	public void setC_cto(String c_cto)
	{
		this.c_cto = c_cto;
	}
	public String getC_status()
	{
		return c_status;
	}
	public void setC_status(String c_status)
	{
		this.c_status = c_status;
	}

	@Override
	public String toString() {
		return "ClientModel [c_name=" + c_name + ", c_desc=" + c_desc
				+ ", c_revenue=" + c_revenue + ", c_employees="
						+ c_employees + ", c_presence=" + c_presence + ", c_ceo="
						+ c_ceo + ", c_cto=" + c_cto + ", c_status=" + c_status
						+ ", c_address=" + c_address + "]";
	}




}
