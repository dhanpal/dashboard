package com.kramtey.service;

import com.kramtey.model.User;

public interface UserService {
	
	User findById(Long id);
	
	void saveUser(User user);
	
}