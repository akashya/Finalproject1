package com.cybage.services;


import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserPassword;
import com.cybage.model.UserRolePermissions;

import java.util.List;

import com.cybage.model.Client;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;

public interface UserService {
	public String addNewUser(User obj);
	public String addNewPermission(Permission obj);
	public String addNewGroup(UserGroup obj);
	public String addNewRole(Role obj);
	public String addRolePermission(UserRolePermissions obj);
	public String addGroupPermission(UserGroupPermissions obj);
	public List<String> sendPermissions();
	public List<String> sendRole();
	public List<String> sendGroup();
	public List<User> sendUsers();
	public User searchUser(String uname);
	public String deleteUser(String uname);
	public String updateUser(User obj);
	public List<Role> sendAllRole();
	public List<Permission> sendlistPermission();
	public String deletePermission(String pname);
	public String updatePermission(Permission obj);
	public String deleteRole(String rname);
	public List<String> sendAllUname();
	public User checkUsersPasswords(UserPassword obj);
	public String updateRole(Role obj);
	public Role searchRole(String name);
	public UserGroup searchGroup(String name);
	public List<String> sendGroupPermission(String name);
	public List<String> sendRolePermission(String name);




}
