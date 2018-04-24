package com.kramtey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kramtey.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    User findByName(String name);
//
//    User findById(Long id);
}
