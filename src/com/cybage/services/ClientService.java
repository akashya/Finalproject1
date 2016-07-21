package com.cybage.services;

import java.util.List;

import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.Client;
import com.cybage.model.ClientDomains;
import com.cybage.model.ClientOffices;



public interface ClientService 
{
	public String addNewClient(ClientDomain obj);
	public String addNewClientAddress(ClientOffices obj);
	public ClientDomain searchclient(String clName);
	public List<String> sendClient();
	public List<Client> sendClientsDetails();
	public String deleteClient(String clName);
	public String updateClient(Client obj);
	public List<ClientDomains> sendCliecntsDomains();
	public List<ClientOffices> sendCliecntsRegion();
	public List<String> sendLocation();
	public List<Client> sendRevenue(int num);

}
