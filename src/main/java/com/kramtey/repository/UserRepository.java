package com.kramtey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kramtey.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findById(Long id);
	
    User findByUserName(String userName);

    List<User> findByUserId(Long userId);
}
