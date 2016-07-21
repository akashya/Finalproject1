package com.cybage.services;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserPassword;
import com.cybage.model.UserRolePermissions;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;


@Service("userserviceObj")
@Transactional
public class UserServiceImpl implements UserService{
	UserDao daoObj=new UserDaoImpl();

	//Add new User
	@Override
	public String addNewUser(User obj) {


		String response="{\"msg\":\"user not added\"}";

		boolean rs =daoObj.addNewUser(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;

	}
 
	//Add new Permission
	@Override
	public String addNewPermission(Permission obj) {
		String response="{\"msg\":\"permission not added\"}";

		boolean rs =daoObj.addNewPermission(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}
	//Add new Group
	@Override
	public String addNewGroup(UserGroup obj) {
		String response="{\"msg\":\"group not added\"}";


		boolean rs =daoObj.addNewGroup(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Add new role
	@Override
	public String addNewRole(Role obj) {
		String response="{\"msg\":\"Role not added\"}";


		boolean rs =daoObj.addNewRole(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Add new rolepermissions
	@Override
	public String addRolePermission(UserRolePermissions obj) {
		String response="{\"msg\":\"RolePermission not added\"}";


		boolean rs =daoObj.addRolePermission(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Add new grouppermissions
	@Override
	public String addGroupPermission(UserGroupPermissions obj) {
		String response="{\"msg\":\"GroupPermission not added\"}";


		boolean rs =daoObj.addGroupPermission(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Send all permissions LIST
	@Override
	public List<String> sendPermissions() {
		List<String> li=daoObj.sendPermissions();
		return li;
	}

	//Send List of all Roles
	@Override
	public List<String> sendRole() {
		List<String> li=daoObj.sendRole();
		return li;

	}

	//Send List of all group names
	@Override
	public List<String> sendGroup() {
		List<String> li=daoObj.sendGroup();
		return li;


	}

	//Send List of all Users
	@Override
	public List<User> sendUsers() {
		List<User> li=daoObj.sendUsers();
		return li;
	}

	//Search User By Name
	@Override
	public User searchUser(String uname) {

		User userObj =daoObj.searchUser(uname);

		return userObj;
	}

	// DeleteUser By name
	@Override
	public String deleteUser(String uname) {
		String response="{\"msg\":\"User not deleted\"}";

		boolean rs =daoObj.deleteUser(uname);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Update User
	@Override
	public String updateUser(User obj) {
		String response="{\"msg\":\"user not updated\"}";

		boolean rs =daoObj.updateUser(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}
	
	//Send List of permissions 
	@Override
	public List<Role> sendAllRole() {
		List<Role> li=daoObj.sendAllRole();
		return li;
	}

	//DeletePermission 
	@Override
	public List<Permission> sendlistPermission() {
		List<Permission> li=daoObj.sendlistPermission();
		return li;
	}

	//Update permission
	@Override
	public String deletePermission(String pname) {
		String response="{\"msg\":\"Permission not deleted\"}";

		boolean rs =daoObj.deletePermission(pname);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Send all roles
	@Override
	public String updatePermission(Permission obj) {
		String response="{\"msg\":\"permission not updated\"}";

		boolean rs =daoObj.updatePermission(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}

	//Search deleteRole
	@Override
	public String deleteRole(String rname) {
		String response="{\"msg\":\"Role not deleted\"}";

		boolean rs =daoObj.deleteRole(rname);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}


	//Check password
	@Override
	public User checkUsersPasswords(UserPassword obj) {

		User response=null;

		response =daoObj.checkUsersPasswords(obj);


		return response ;
	}

	//Send all users name
	@Override
	public List<String> sendAllUname() {
		List<String> li=daoObj.sendAllUname();
		return li;

	}

	//update Role
	@Override
	public String updateRole(Role obj) {
		String response="{\"msg\":\"role not updated\"}";

		boolean rs =daoObj.updateRole(obj);
		if(rs==true)
		{
			response="{\"msg\":\"success\"}";	
		}

		return response ;
	}
	
	//Search role
	@Override
	public Role searchRole(String name) {
		Role roleObj =daoObj.searchRole(name);

		return roleObj;
	}
	
	//Search group
	@Override
	public UserGroup searchGroup(String name) {
		UserGroup gObj =daoObj.searchGroup(name);

		return gObj;
	}

	@Override
	public List<String> sendGroupPermission(String name) {
		List<String> li=daoObj.sendGroupPermission(name);
		return li;
	}

	@Override
	public List<String> sendRolePermission(String name) {
		List<String> li=daoObj.sendRolePermission(name);
		return li;
	}




}
