package com.cybage.services;




import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.dao.ClientDao;
import com.cybage.dao.ClientDaoImpl;
import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.Client;
import com.cybage.model.ClientDomains;
import com.cybage.model.ClientOffices;
import com.cybage.model.ClientPOC;
import com.cybage.model.User;


@Service("serviceObj")
@Transactional
public class ClientServiceImpl implements ClientService
{
	ClientDao daoObj=new ClientDaoImpl();

	// Add new client
	@Override
	public String addNewClient(ClientDomain domain)
	{	

		System.out.println("in service");
		String response="{\"msg\":\"Poc Not Found\"}";
		if(domain.getPoc1()!=null)
		{
			System.out.println("in service in first if");
			User uObj=daoObj.checkUser(domain.getPoc1());
			User uObj1=daoObj.checkUser(domain.getPoc2());

			if(uObj!=null)
			{
				if(uObj1!=null)
				{
					System.out.println("in service in second if");
					Client cObj=new Client(domain.getName(),domain.getDesc(),domain.getRevenue(),domain.getEmployees(),domain.getPresence(), domain.getCeo(), domain.getCto(),domain.getStatus(),domain.getAddress());
					boolean rs= daoObj.addNewClient(cObj);
					if(rs==true)
					{
						//add pocs
						ClientPOC pocObj=new ClientPOC(uObj.getU_name(),domain.getName(),uObj.getU_contact());
						daoObj.addNewClientPoc(pocObj);
						ClientPOC pocObj1=new ClientPOC(uObj1.getU_name(),domain.getName(),uObj1.getU_contact());
						daoObj.addNewClientPoc(pocObj1);

						//add domins
						String domain1=domain.getDomain1();
						String domain2=domain.getDomain2();
						String domain3=domain.getDomain3();
						if(domain1!=null)
						{
							ClientDomains cd1= new ClientDomains(domain.getName(), domain1);
							daoObj.addDomoin(cd1);
						}
						if(domain2!=null)
						{
							ClientDomains cd2= new ClientDomains(domain.getName(), domain2);
							daoObj.addDomoin(cd2);
						}
						if(domain3!=null)
						{
							ClientDomains cd3= new ClientDomains(domain.getName(), domain3);
							daoObj.addDomoin(cd3);
						}
						response="{\"msg\":\"success\"}";
					}
					else
					{
						response="{\"msg\":\"duplicate client not allow\"}";
					}

				}

			}

		}

		return response;
	}

	//Add Locatons
	@Override
	public String addNewClientAddress(ClientOffices obj) {
		// TODO Auto-generated method stub
		String response="{\"msg\":\"address not added\"}";

		boolean rs =daoObj.addAddress(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//search client
	@Override
	public ClientDomain searchclient(String clName) {
		ClientDomain clObj =daoObj.searchClient(clName);
		return clObj;

	}

	//send list of clients names
	@Override
	public List<String> sendClient() {
		List<String> li=daoObj.sendClient();
		return li;

	}

	//send all clientsDetails
	@Override
	public List<Client> sendClientsDetails() {
		List<Client> li=daoObj.sendClientsDetails();
		return li;
	}

	//DeleteClient
	@Override
	public String deleteClient(String clName) {
		String response="{\"msg\":\"client not deleted\"}";

		boolean rs =daoObj.deleteClient(clName);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;

	}

	//Update client
	@Override
	public String updateClient(Client obj) {
		String response="{\"msg\":\"client not updated\"}";

		boolean rs =daoObj.updateClient(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;

	}

	//Send DomainsTable
	@Override
	public List<ClientDomains> sendCliecntsDomains() {
		List<ClientDomains> li=daoObj.sendCliecntsDomains();
		return li;
	}

	//Send Region Table
	@Override
	public List<ClientOffices> sendCliecntsRegion() {
		List<ClientOffices> li=daoObj.sendCliecntsRegion();
		return li;

	}
	
	//Send List of Locations
	@Override
	public List<String> sendLocation() {
		List<String> li=daoObj.sendLocation();
		return li;
	}

	//Fliter Revenue 
	@Override
	public List<Client> sendRevenue(int num) {
		List<Client> li=daoObj.sendRevenue(num);
		return li;
	}





}
