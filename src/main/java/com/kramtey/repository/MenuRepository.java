package com.kramtey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kramtey.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{
	
	Menu findByMenuId(Long menuId);
}