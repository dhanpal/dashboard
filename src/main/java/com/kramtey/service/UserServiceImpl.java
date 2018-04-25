package com.kramtey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kramtey.model.User;
import com.kramtey.repository.UserRepository;
import com.kramtey.response.UserDetailsResponse;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findByUserId(Long userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	@Override
	public UserDetailsResponse findUserDetails(Long userId){
		UserDetailsResponse detailsResponse = new UserDetailsResponse();
		User user = findByUserId(userId);
		return detailsResponse;
	}
	
}
