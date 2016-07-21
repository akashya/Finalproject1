package com.cybage.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.Client;
import com.cybage.model.ClientDomains;
import com.cybage.model.ClientOffices;
import com.cybage.model.ClientPOC;
import com.cybage.model.User;

@Repository
public class ClientDaoImpl implements ClientDao
{

	/*Method to Add new client*/
	@Override
	public boolean addNewClient(Client obj) 
	{
		boolean rs=false;
		try 
		{
			System.out.println("in dao add new client method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			rs=true;
		} 
		catch (Exception e)
		{
            System.out.println("Client Not Added Succesfully");
		}
		return rs;

	}

	/*Method to Check user is exist*/
	@Override
	public User checkUser(String name) 
	{
		User obj=new User();
		String response="error";
		try 
		{
			System.out.println("in dao check user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			obj=entitymanager.find(User.class,name);
			System.out.println(obj.toString());
			if(obj!=null)
			{
				System.out.println("in dao in if check user method");
				response="success";
			}
			entitymanager.getTransaction().commit();   
			entitymanager.close( );
			emfactory.close( );
			
		} 
		catch (Exception e)
		{
			System.out.println("User not found");
		}

		return obj;
	}

	/*Method to Add new clientPOC*/
	@Override
	public void addNewClientPoc(ClientPOC obj)
	{
		try 
		{
			System.out.println("in dao add new client poc method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );

		} 
		catch (Exception e)
		{
            System.out.println("POC not added successfully");
		}



	}

	/*Method to Add client Domains*/
	@Override
	public void addDomoin(ClientDomains obj) {
		
		try {
			System.out.println("in dao add new domin method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
		} catch (Exception e) {
			
			System.out.println("Domain not added succefully");
		}


	}

	/*Method to Add Address of client*/
	@Override
	public boolean addAddress(ClientOffices obj) {
		boolean rs=false;

		try {
			System.out.println("in dao add new office method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Adress not added successfully");
		}

		return rs;
	}

	/*Method to Search client By name*/
	@Override
	public ClientDomain searchClient(String clName) {
		Client obj=null;
		ClientDomain cObj=null;
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction().begin( );

		obj=entitymanager.find(Client.class,clName);
		if(obj!=null)
		{
			List<String> domains=null;

            Query query = entitymanager.
					createQuery("select d.domain_name from ClientDomains d where d.c_name='"+clName+"'");
			domains = query.getResultList();


			String[] result = new String[3];
            for (int i = 0; i <domains.size(); i++) 
            {
                result[i] =(String)domains.get(i);
            }
			for (int i = 0; i < result.length; i++) 
			{
				if(result[i]==null)
				{
					result[i]="NA";
				}
			}
			
	        List<String> pocs=null;;
            Query query1 = entitymanager.
					createQuery("select p.u_name from ClientPOC p where p.c_name='"+clName+"'");
			pocs = query1.getResultList();
			String[] pocresult = new String[pocs.size()];

			for (int i = 0; i < pocs.size(); i++) 
			{
				pocresult[i] =(String)pocs.get(i);

			}

			System.out.println(result[1]);
			cObj=new ClientDomain(obj.getC_name(), obj.getC_address(), result[0], result[1], result[2], obj.getC_desc(),obj.getC_revenue(), obj.getC_employees(), obj.getC_presence(), obj.getC_ceo(), obj.getC_cto(), pocresult[0], pocresult[1], obj.getC_status());
			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			System.out.println(obj.toString());

		}
		return cObj;
	}


	/*Method to Send List of Clients Name*/
	@Override
	public List<String> sendClient() {
		List<String> list=null;
		try {
			System.out.println("in dao  sendcliect method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p.c_name from Client p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {

		}

		return list;
	}

	/*Method to Send List of Client With all detail*/
	@Override
	public List<Client> sendClientsDetails() {
		List<Client> list=null;
		try {
			System.out.println("in dao  sendcliect method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select c from Client c ");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );

            } catch (Exception e) 
		    {
                System.out.println("Client List Not Send Successfully");
		    }

		return list;
	}

	/*Method to Inactive Client*/
	@Override
	public boolean deleteClient(String clName) {
		boolean rs=false;

		try {
			System.out.println("in dao delete client method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Client c = entitymanager.find( Client.class, clName );
			c.setC_status("inactive");

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
               System.out.println("Client not siccessfully Inactive");
		}
        return rs;

	}

	/*Method to Update client*/
	@Override
	public boolean updateClient(Client obj) {
		boolean rs=false;

		try {
			System.out.println("in dao update client method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Client c = entitymanager.find( Client.class, obj.getC_name() );
			c.setC_desc(obj.getC_desc());
			c.setC_revenue(obj.getC_revenue());
			c.setC_employees(obj.getC_employees());
			c.setC_presence(obj.getC_presence());
			c.setC_ceo(obj.getC_ceo());
			c.setC_cto(obj.getC_cto());
			c.setC_status(obj.getC_status());

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
            System.out.println("Client Not updated Successfully");
		}
        return rs;

	}

	/*Method to Send  List of Client Domains with all detail*/
	@Override
	public List<ClientDomains> sendCliecntsDomains() {
		List<ClientDomains> list=null;
		try {
			System.out.println("in dao  sendcliectdomines method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select d from ClientDomains d ");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			
			System.out.println("ClientDomains Not send Succesfully");
		}
        return list;

	}

	/*Method to Send  List of Client Offices with all detail*/
	@Override
	public List<ClientOffices> sendCliecntsRegion() {
		List<ClientOffices> list=null;
		try {
			System.out.println("in dao  sendcliectregions method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select r from ClientOffices r ");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );
           } catch (Exception e) 
		   {
        	   System.out.println("Client Offices not send successfully");
		   }

		return list;
	}

	/*Method to Send  List of Client Locations */
	@Override
	public List<String> sendLocation() {
		List<String> list=null;
		try {
			System.out.println("in dao add new sendlocation method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select distinct p.location from ClientOffices p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );
			} 
			catch (Exception e) 
			{
				System.out.println("Client Locations  Not Send Successfully");
			}

		return list;
	}

	//Filter Revenue
	@Override
	public List<Client> sendRevenue(int num) {
		List<Client> list=null;
		try {

            System.out.println("in dao add new sendlocation method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			if(num == 1)
			{
				Query query = entitymanager.
						createQuery("select c from Client c where c.c_revenue  Between 1 and 100");
				list = query.getResultList();
			}
			else if (num==2) {

				Query query = entitymanager.
						createQuery("select c from Client c where c.c_revenue  Between 100 and 1000 ");
				list = query.getResultList();
			}
			else
			{
				Query query = entitymanager.
						createQuery("select c from Client c where c.c_revenue > 1000");
				list = query.getResultList();
			}

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );

			} catch (Exception e) 
			{
				System.out.println("Revenue not send Successfully");
			}

		return list;
	}
}
