package com.cybage.dao;


import java.util.List;

import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.Client;
import com.cybage.model.ClientDomains;
import com.cybage.model.ClientOffices;
import com.cybage.model.ClientPOC;
import com.cybage.model.User;

public interface ClientDao 
{
	public boolean addNewClient(Client obj);
	public User checkUser(String name);
	public void addNewClientPoc(ClientPOC obj);
	public void addDomoin(ClientDomains obj);
	public boolean addAddress(ClientOffices obj);
	public ClientDomain searchClient(String clName);
	public List<String> sendClient();
	public List<Client> sendClientsDetails();
	public boolean deleteClient(String clName);
	public boolean updateClient(Client obj);
	public List<ClientDomains> sendCliecntsDomains();
	public List<ClientOffices> sendCliecntsRegion();
	public List<String> sendLocation();
	public List<Client> sendRevenue(int num);



}
