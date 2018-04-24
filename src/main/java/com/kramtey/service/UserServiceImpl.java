package com.kramtey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kramtey.model.User;
import com.kramtey.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
}
