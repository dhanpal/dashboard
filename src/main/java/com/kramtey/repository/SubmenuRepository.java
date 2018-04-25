package com.kramtey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kramtey.model.Submenu;
import com.kramtey.model.User;

@Repository
public interface SubmenuRepository extends JpaRepository<Submenu, Long> {

	Submenu findBySubmenuId(Long submenuId);
}
