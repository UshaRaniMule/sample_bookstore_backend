package com.springbootsample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsample.model.Users;
import com.springbootsample.repository.UserRepository;
import com.springbootsample.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.getAllUsers();
	}

	@Override
	public Boolean userLogin(Users users) {
		// TODO Auto-generated method stub
		return userRepository.userLogin(users);
	}

}
