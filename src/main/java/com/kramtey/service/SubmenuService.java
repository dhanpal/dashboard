package com.kramtey.service;

import java.util.List;

import com.kramtey.model.Submenu;

public interface SubmenuService {

	Submenu findBySubmenuId(Long submenuId);
	
//	Submenu findBySubmenuName(String submenuName);

	void saveSubmenu(Submenu submenu);

	void updateSubmenu(Submenu submenu);

	void deleteSubmenuById(Long submenuId);

	void deleteAllSubmenus();

	List<Submenu> findAllSubmenus();

//	boolean isSubmenuExist(Submenu submenu);
}
