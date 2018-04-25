package com.kramtey.service;

import com.kramtey.model.User;
import com.kramtey.response.UserDetailsResponse;

public interface UserService {
	
	User findByUserId(Long userId);
	
	void saveUser(User user);
	
	public UserDetailsResponse findUserDetails(Long userId);
}