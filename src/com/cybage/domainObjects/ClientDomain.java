package com.cybage.domainObjects;

public class ClientDomain 
{
	String name;
	String address;
	String domain1;
	String domain2;
	String domain3;
	String desc;
	int revenue;
	String employees;
	String presence;
	String ceo;
	String cto;
	String poc1;
	String poc2;
	String status;

	public ClientDomain() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ClientDomain(String name, String address, String domain1,
			String domain2, String domain3, String desc, int revenue,
			String employees, String presence, String ceo, String cto,
			String poc1, String poc2, String status) {
		super();
		this.name = name;
		this.address = address;
		this.domain1 = domain1;
		this.domain2 = domain2;
		this.domain3 = domain3;
		this.desc = desc;
		this.revenue = revenue;
		this.employees = employees;
		this.presence = presence;
		this.ceo = ceo;
		this.cto = cto;
		this.poc1 = poc1;
		this.poc2 = poc2;

		this.status = status;
	}



	public String getDomain1() {
		return domain1;
	}



	public void setDomain1(String domain1) {
		this.domain1 = domain1;
	}



	public String getDomain2() {
		return domain2;
	}



	public void setDomain2(String domain2) {
		this.domain2 = domain2;
	}



	public String getDomain3() {
		return domain3;
	}



	public void setDomain3(String domain3) {
		this.domain3 = domain3;
	}



	public String getPoc1() {
		return poc1;
	}



	public void setPoc1(String poc1) {
		this.poc1 = poc1;
	}



	public String getPoc2() {
		return poc2;
	}



	public void setPoc2(String poc2) {
		this.poc2 = poc2;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getPresence() {
		return presence;
	}
	public void setPresence(String presence) {
		this.presence = presence;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getCto() {
		return cto;
	}
	public void setCto(String cto) {
		this.cto = cto;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "ClientDomain [name=" + name + ", address=" + address
				+ ", domain1=" + domain1 + ", domain2=" + domain2
				+ ", domain3=" + domain3 + ", desc=" + desc + ", revenue="
				+ revenue + ", employees=" + employees + ", presence="
				+ presence + ", ceo=" + ceo + ", cto=" + cto + ", poc1=" + poc1
				+ ", poc2=" + poc2 + ", status="
				+ status + "]";
	}





}
