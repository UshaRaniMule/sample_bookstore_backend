package com.springbootsample.repository;

import java.util.List;

import com.springbootsample.model.Users;

public interface UserRepository {
	
	public List<Users> getAllUsers();

	public Boolean userLogin(Users users);

}
