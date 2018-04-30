package com.kramtey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kramtey.model.Menu;
import com.kramtey.model.Submenu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{
	
	Menu findByMenuId(Long menuId);
	
	List<Submenu> findSubmenuIdByMenuId(Long menuId);
}