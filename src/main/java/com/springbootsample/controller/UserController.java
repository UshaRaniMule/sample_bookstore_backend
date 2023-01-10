package com.springbootsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsample.exception.UserNotFoundException;
import com.springbootsample.model.Users;
import com.springbootsample.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getusers")
	public ResponseEntity<List<Users>> getAllUsers()
	{
		return new ResponseEntity<List<Users>>(userService.getAllUsers(),HttpStatus.OK);
	}
	
	@PostMapping("/userlogin")
	public ResponseEntity<Boolean> userLogin(@RequestBody Users users)
	{
		
		boolean userLoginFlag = userService.userLogin(users);
		if(userLoginFlag) {
			
			return new ResponseEntity<Boolean>(userLoginFlag,HttpStatus.OK);
		}
		
		throw new UserNotFoundException();
		
//		return new ResponseEntity<Boolean>(userService.userLogin(users),HttpStatus.OK);
	
	}


}
