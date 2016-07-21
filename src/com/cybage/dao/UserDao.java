package com.cybage.dao;


import com.cybage.model.UserGroup;
import com.cybage.model.UserGroupPermissions;
import com.cybage.model.UserPassword;
import com.cybage.model.UserRolePermissions;

import java.util.List;

import com.cybage.model.Client;
import com.cybage.model.Permission;
import com.cybage.model.Role;
import com.cybage.model.User;

public interface UserDao {
	public boolean addNewUser(User obj);
	public boolean addNewPermission(Permission obj);
	public boolean addNewGroup(UserGroup obj);
	public boolean addNewRole(Role obj);
	public boolean addRolePermission(UserRolePermissions obj);
	public boolean addGroupPermission(UserGroupPermissions obj);
	public List<String> sendPermissions();
	public List<String> sendRole();
	public List<String> sendGroup();
	public List<User> sendUsers();
	public User searchUser(String uname);
	public boolean deleteUser(String uname);
	public boolean updateUser(User obj);
	public List<Role> sendAllRole();
	public List<Permission> sendlistPermission();
	public boolean deletePermission(String pname);
	public boolean updatePermission(Permission obj);
	public boolean deleteRole(String rname);
	public List<String> sendAllUname();
	public User checkUsersPasswords(UserPassword obj);
	public boolean updateRole(Role obj);
	public Role searchRole(String name);
	public UserGroup searchGroup(String name);
	public List<String> sendGroupPermission(String name);
	public List<String> sendRolePermission(String name);
}
