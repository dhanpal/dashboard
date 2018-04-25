package com.kramtey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kramtey.model.User;
import com.kramtey.response.UserDetailsResponse;
import com.kramtey.service.UserServiceImpl;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@GetMapping("/{userId}")
	User getUser(@PathVariable Long userId) {
		return userServiceImpl.findByUserId(userId);
	}
	
	@GetMapping("/{userDetails}")
	UserDetailsResponse getUserDetails(@PathVariable Long userId) {
		return userServiceImpl.findUserDetails(userId);
	}
	
	@PostMapping
	public void createUser(@RequestBody User user){
		userServiceImpl.saveUser(user);
	}
}
