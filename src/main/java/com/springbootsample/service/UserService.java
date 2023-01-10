package com.springbootsample.service;

import java.util.List;

import com.springbootsample.model.Users;


public interface UserService {

	List<Users> getAllUsers();

	Boolean userLogin(Users users);

}
