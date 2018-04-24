package com.kramtey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kramtey.model.User;

@RestController
@RequestMapping("/User")
public class UserController {

//	@Autowired
//	UserServiceImpl userServiceImpl;
	
	@GetMapping("/{id}")
	User getUser(@PathVariable Long id) {
		return null;
//		return userServiceImpl.findById(id);
	}
	
	@PostMapping
	public void createUser(@RequestBody User user){
//		userServiceImpl.saveUser(user);
	}
}
