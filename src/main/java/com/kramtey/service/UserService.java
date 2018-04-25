package com.kramtey.service;

import java.util.List;

import com.kramtey.model.User;
import com.kramtey.response.UserDetailsResponse;

public interface UserService {
	
	User findById(Long id);
	
	List<User> findByUserId(Long userId);
	
	void saveUser(User user);
	
	public UserDetailsResponse findUserDetails(Long userId);
}