package com.cybage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserPassword;
import com.cybage.model.UserRolePermissions;
import com.cybage.model.Client;
import com.cybage.model.ClientPOC;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;

public class UserDaoImpl implements UserDao {


	/*Method to Add new User*/
	@Override
	public boolean addNewUser(User obj) {


		boolean rs=false;

		try {
			System.out.println("in dao add new user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
            
			System.out.println("user Not addes successfully");
		}
		
		return rs;

	}

	/*Method to Add new client*/
	@Override
	public boolean addNewPermission(Permission obj) {

		boolean rs=false;
        try {
			System.out.println("in dao add new permission method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
		    emfactory.close( );
			rs=true;

		} catch (Exception e) {
            System.out.println("Permossion not added successfully");
		}
        return rs;
	}

	//Method to Add new Group
	@Override
	public boolean addNewGroup(UserGroup obj) {
		boolean rs=false;

		try {
			System.out.println("in dao add new group method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Group not added successfully");  
		}

		return rs;
	}

	//Add New Role
	@Override
	public boolean addNewRole(Role obj) {
		boolean rs=false;

		try {
			System.out.println("in dao add new role method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Role not added successfully");  
		}
		return rs;
	}

	//Add Permissions to Role
	@Override
	public boolean addRolePermission(UserRolePermissions obj) {
		boolean rs=false;

		try {
			System.out.println("in dao add new rolepermission method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Permission not added successfully");  
		}

		return rs;

	}

	//Add Permissions to Group 
	@Override
	public boolean addGroupPermission(UserGroupPermissions obj) {
		boolean rs=false;

		try {
			System.out.println("in dao add new grouppermission method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			entitymanager.persist(obj);
			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Permission not added successfully"); 
		}

		return rs;
	}

	
	// Send List of permission names
	@Override
	public List<String> sendPermissions() {
		List<String> list=null;
		try {
			System.out.println("in dao add new sendpermission method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p.p_name from Permission p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
           } catch (Exception e) 
		   {
        	   System.out.println("Permission names not Send successfully"); 
		   }

		return list;
	}

	//Send List of Role names
	@Override
	public List<String> sendRole() {
		List<String> list=null;
		try {
			System.out.println("in dao  sendrole method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p.r_name from Role p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("roles names not Send successfully"); 
		}

		return list;
	}

	//Send List of Group Names
	@Override
	public List<String> sendGroup() {
		List<String> list=null;
		try {
			System.out.println("in dao  sendgroup method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p.g_name from UserGroup p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("Group names not Send successfully"); 
		}

		return list;

	}

	//Send List Of all Users
	@Override
	public List<User> sendUsers() {
		List<User> list=null;
		try {
			System.out.println("in dao  sendallUsers method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			 EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select r  from User r");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("User List not send ");

		}

		return list;
	}

	//Search User 
	@Override
	public User searchUser(String uname) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction().begin( );

		User u = entitymanager.find( User.class, uname);


		entitymanager.getTransaction().commit();
		entitymanager.close( );
		emfactory.close( );


		return u;
	}

	//Delete User
	@Override
	public boolean deleteUser(String uname) {
		boolean rs=false;

		try {
			System.out.println("in dao delete user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			ClientPOC poc=entitymanager.find( ClientPOC.class, uname );
			System.out.println(poc);;

			if(poc!=null)
			{
				rs=false;
			}
			else
			{
				User u = entitymanager.find( User.class, uname );
				u.setU_status("inactive");
				rs=true;
			}

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("User not deleted successfully");
		}



		return rs;
	}
	
	//update User
	@Override
	public boolean updateUser(User obj) {
		boolean rs=false;

		try {
			System.out.println("in dao update user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			User u = entitymanager.find( User.class, obj.getU_name() );
			u.setU_status(obj.getU_status());
			u.setU_role(obj.getU_role());
			u.setU_group(obj.getU_group());
			u.setU_contact(obj.getU_contact());
			u.setU_password(obj.getU_password());
			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("User not updated successfully");
		}
		return rs;
	}

	//Send List Of All Roles
	@Override
	public List<Role> sendAllRole() {
		List<Role> list=null;
		try {
			System.out.println("in dao  sendallRoles method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select r  from Role r");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
            entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("Role List not send successfully");
		}

		return list;
	}

	//Send List of Permmisions
	@Override
	public List<Permission> sendlistPermission() {
		List<Permission> list=null;
		try {
			System.out.println("in dao  sendallRoles method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p  from Permission p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("Permission list not send successfully");
		}

		return list;
	}
	//Delete Permissoins
	@Override
	public boolean deletePermission(String pname) {
		boolean rs=false;

		try {
			System.out.println("in dao delete user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Permission p = entitymanager.find( Permission.class, pname );
			p.setP_status("inactive");

			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Permission not Deleted successfully");
		}



		return rs;
	}

	//Update Permissions
	@Override
	public boolean updatePermission(Permission obj) {
		boolean rs=false;

		try {
			System.out.println("in dao update user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
		    EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Permission p= entitymanager.find( Permission.class, obj.getP_name() );
			p.setP_desc(obj.getP_desc());
			p.setP_status(obj.getP_status());
			p.setP_type(obj.getP_type());
			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Permission not updated successfully");
		}
		return rs;
	}

	//Delete role
	@Override
	public boolean deleteRole(String rname) {
		boolean rs=false;

		try {
			System.out.println("in dao delete role method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Role r = entitymanager.find( Role.class, rname );
			r.setR_status("inactive");


			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {

			System.out.println("Role not Delete Successfully");
		}
		return rs;
	}

	//Validate LoginName and Password
	@Override
	public User checkUsersPasswords(UserPassword obj) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction().begin( );
		Query query = entitymanager.
				createQuery("select u from User u where u.u_name='"+obj.getU_name()+"' and u.u_password='"+obj.getU_password()+"' ");

		User u=null;
		try {
			u = (User) query.getSingleResult();
		} catch (Exception e) 
		{
			System.out.println("user not found");
		}
		entitymanager.getTransaction().commit();
		entitymanager.close( );
		emfactory.close( );


		return u;
	}

	//List of User names
	@Override
	public List<String> sendAllUname() {
		List<String> list=null;
		try {
			System.out.println("in dao  send all uname method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p.u_name from User p");
			list = query.getResultList();

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );


		} catch (Exception e) {
			System.out.println("Usernames not send");
		}

		return list;
	}

	//Upadte role
	@Override
	public boolean updateRole(Role obj) {
		boolean rs=false;

		try {
			System.out.println("in dao update user method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Role r = entitymanager.find( Role.class,obj.getR_name() );
			r.setR_desc(obj.getR_desc());
			r.setR_status(obj.getR_status());

			entitymanager.getTransaction().commit();
			entitymanager.close( );
			emfactory.close( );
			rs=true;

		} catch (Exception e) {
			System.out.println("Role not upadated successfully");
		}
		return rs;
	}

	//Search Role
	@Override
	public Role searchRole(String name) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction().begin( );

		Role r = entitymanager.find( Role.class, name);
		
		entitymanager.getTransaction().commit();
		entitymanager.close( );
		emfactory.close( );
		return r;
	}

	//Search Group
	@Override
	public UserGroup searchGroup(String name) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction().begin( );

		UserGroup g = entitymanager.find( UserGroup.class, name);
		entitymanager.getTransaction().commit();
		entitymanager.close( );
		emfactory.close( );
		return g;
	}

	@Override
	public List<String> sendGroupPermission(String name) {
		List<String> list=null;
		try {
			System.out.println("in dao group sendpermission method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select distinct p.p_name from UserGroupPermissions p where p.g_name='"+name+"'");
			//select u from User u where u.u_name='"+obj.getU_name()+"'
			list = query.getResultList();

			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
           } catch (Exception e) 
		   {
        	   System.out.println("Permission names not Send successfully"); 
		   }

		return list;
	}
	@Override
	public List<String> sendRolePermission(String name) {
		List<String> list=null;
		try {
			System.out.println("in dao role sendpermission method");
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ClientUser_EcLink" );
			EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction().begin( );
			Query query = entitymanager.
					createQuery("select p.p_name from UserRolePermissions p where p.r_name='"+name+"'");
			//select u from User u where u.u_name='"+obj.getU_name()+"'
			list = query.getResultList();

			entitymanager.getTransaction().commit();

			entitymanager.close( );
			emfactory.close( );
           } catch (Exception e) 
		   {
        	   System.out.println("Permission names not Send successfully"); 
		   }

		return list;
	}



}
