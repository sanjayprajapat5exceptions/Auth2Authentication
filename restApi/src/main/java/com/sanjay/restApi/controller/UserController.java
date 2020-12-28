package com.sanjay.restApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.restApi.entity.User;
import com.sanjay.restApi.service.UserDetailServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserDetailServiceImpl userDetailServiceImpl;
	
	@GetMapping("/user")
	public List<User> getUserList()
	{
		return this.userDetailServiceImpl.listUser();
		
	}
	
	@PostMapping("/useradd")
	public void UserAdd(@RequestBody User user)
	{
		System.out.println("inside Registration Controller ");
		this.userDetailServiceImpl.userSave(user);
	}
	

}
