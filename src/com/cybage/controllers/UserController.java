package com.cybage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserPassword;
import com.cybage.model.UserRolePermissions;
import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.Client;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;
import com.cybage.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userserviceObj;


	//Add new User
	@RequestMapping(value = "/add",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String getUser(@RequestBody User userObj)
	{
		System.out.println(userObj.toString());
		String response=userserviceObj.addNewUser(userObj);
		System.out.println(response);	
		return response;
	}


	//Add new Permission
	@RequestMapping(value = "/addpermissions",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String getUserPermissions(@RequestBody Permission permiObj)
	{
		System.out.println(permiObj.toString());
		String response=userserviceObj.addNewPermission(permiObj);
		System.out.println(response);	
		return response;
	}


	//Add new Group
	@RequestMapping(value = "/addgroup",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String getGroup(@RequestBody UserGroup grpObj)
	{
		System.out.println(grpObj.toString());
		String response=userserviceObj.addNewGroup(grpObj);
		System.out.println(response);	
		return response;
	}


	//Add new role
	@RequestMapping(value = "/addrole",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String getGroup(@RequestBody Role roleObj)
	{
		System.out.println(roleObj.toString());
		String response=userserviceObj.addNewRole(roleObj);
		System.out.println(response);	
		return response;
	}


	//Add new rolepermissions
	@RequestMapping(value = "/addrolepermissions",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String getGroup(@RequestBody UserRolePermissions urpObj)
	{
		System.out.println(urpObj.toString());
		String response=userserviceObj.addRolePermission(urpObj);
		System.out.println(response);	
		return response;
	}

	//Add new grouppermissions
	@RequestMapping(value = "/addgrouppermissions",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String getGroup(@RequestBody UserGroupPermissions ugpObj)
	{
		System.out.println(ugpObj.toString());
		String response=userserviceObj.addGroupPermission(ugpObj);
		System.out.println(response);	
		return response;
	}
	
	//Send all permissions LIST
	@RequestMapping(value = "/getpermissions",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<String> sendPermissions()
	{
		List<String> li;
		li=userserviceObj.sendPermissions();
		
		return li;
	}

	//Send List of all Roles
	@RequestMapping(value = "/getroles",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<String> sendRoles()
	{
		List<String> li;
        li=userserviceObj.sendRole();

		return li;
	}

	//Send List of all group names
	@RequestMapping(value = "/getgroup",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<String> sendGroups()
	{
		List<String> li;
		li=userserviceObj.sendGroup();

		return li;
	}

	//Send List of all Users
	@RequestMapping(value = "/getallusers",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<User> sendUsers()
	{
		List<User> li;
		li=userserviceObj.sendUsers();

		return li;
	}

	//Search User By Name
	@RequestMapping(value = "/searchuser/{name}",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public User searchUser( @PathVariable("name") String name)
	{
		User userObj;

		userObj=userserviceObj.searchUser(name);

		return userObj;
	}

	// DeleteUser By name
	@RequestMapping(value = "/deleteuser/{name}",method = RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
	public String deleteUser( @PathVariable("name") String name)
	{
		String response=userserviceObj.deleteUser(name);
		System.out.println(response);	
		return response;
	}

	//Update User
	@RequestMapping(value = "/update",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)

	public String updateUsers(@RequestBody User userObj)
	{
		String response=userserviceObj.updateUser(userObj);

		return response;
	}	


	//Send List of permissions 
	@RequestMapping(value = "/getallpermissions",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Permission> sendlistPermission()
	{
		List<Permission> li;

		li=userserviceObj.sendlistPermission();

		return li;
	}

	//DeletePermission 
	@RequestMapping(value = "/deletepermission/{name}",method = RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
	public String deletePermission( @PathVariable("name") String name)
	{
		String response=userserviceObj.deletePermission(name);
		System.out.println(response);	
		return response;
	}

	//Update permission
	@RequestMapping(value = "/updatepermission",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public String updatePermission(@RequestBody Permission perObj)
	{
		String response=userserviceObj.updatePermission(perObj);

		return response;
	}

	//Send all roles
	@RequestMapping(value = "/getallroles",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Role> sendlistRoles()
	{
		List<Role> li;

		li=userserviceObj.sendAllRole();
		//System.out.println(response);	
		return li;
	}


	//Search deleteRole
	@RequestMapping(value = "/deleterole/{name}",method = RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
	public String deleteRole( @PathVariable("name") String name)
	{
		String response=userserviceObj.deleteRole(name);
		System.out.println(response);	
		return response;
	}


	//Check password
	@RequestMapping(value = "/checkuserpass",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)

	public User checkUsersPasswords(@RequestBody UserPassword userObj)
	{
		User response=userserviceObj.checkUsersPasswords(userObj);

		return response;
	}	

	//Send all users name
	@RequestMapping(value = "/getusersname",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<String> sendAllUnames()
	{
		List<String> li;

		li=userserviceObj.sendAllUname();

		return li;
	}


	//update Role
	@RequestMapping(value = "/updaterole",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)

	public String updateRole(@RequestBody Role userObj)
	{
		String response=userserviceObj.updateRole(userObj);

		return response;
	}


	//Search role
	@RequestMapping(value = "/roleinfo/{name}",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public Role searchRoles( @PathVariable("name") String name)
	{
		System.out.println(name+"*********");
		Role roleObj;
        roleObj=userserviceObj.searchRole(name);
        System.out.println(roleObj.toString());

		return roleObj;
	}

	//Search group
	@RequestMapping(value = "/groupinfo/{name}",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public UserGroup searchGroups( @PathVariable("name") String name)
	{
		UserGroup gObj;

		gObj=userserviceObj.searchGroup(name);

		return gObj;
	}
	
	//Send List of all permission for group
	@RequestMapping(value = "/getgrouppermission/{name}",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public List<String> sendGroupsPremissions(@PathVariable("name") String name)
	{
		List<String> li;
		li=userserviceObj.sendGroupPermission(name);

		return li;
	}
	//Send List of all permission for role
		@RequestMapping(value = "/getrolepermission/{name}",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
		public List<String> sendRolePremissions(@PathVariable("name") String name)
		{
			List<String> li;
			li=userserviceObj.sendRolePermission(name);

			return li;
		}

}
