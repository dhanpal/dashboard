package com.kramtey.service;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kramtey.model.User;
import com.kramtey.repository.MenuRepository;
import com.kramtey.repository.SubmenuRepository;
import com.kramtey.repository.UserRepository;
import com.kramtey.response.UserDetailsResponse;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MenuRepository menuRepository;
	
	@Autowired
	SubmenuRepository submenuRepository;
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}
	
	@Override
	public List<User> findByUserId(Long userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	@Override
	public UserDetailsResponse findUserDetails(Long userId){
		UserDetailsResponse detailsResponse = new UserDetailsResponse();
		List<User> users = userRepository.findByUserId(userId);
		return detailsResponse;
	}
}
