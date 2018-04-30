package com.kramtey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kramtey.model.Submenu;
import com.kramtey.repository.SubmenuRepository;

public class SubmenuServiceImpl implements SubmenuService{

	@Autowired
	SubmenuRepository submenuRepository;
	
	@Override
	public Submenu findBySubmenuId(Long submenuId) {
		return submenuRepository.findBySubmenuId(submenuId);
	}

//	@Override
//	public Submenu findBySubmenuName(String submenuName) {
//		return submenuRepository.findBySubmenuName(submenuName);
//	}

	@Override
	public void saveSubmenu(Submenu submenu) {
		submenuRepository.save(submenu);
	}

	@Override
	public void updateSubmenu(Submenu submenu) {
		saveSubmenu(submenu) ;		
	}

	@Override
	public void deleteSubmenuById(Long submenuId) {
		submenuRepository.delete(submenuId);		
	}

	@Override
	public void deleteAllSubmenus() {
		submenuRepository.deleteAll();		
	}

	@Override
	public List<Submenu> findAllSubmenus() {
		return submenuRepository.findAll();
	}

//	@Override
//	public boolean isSubmenuExist(Submenu submenu) {
//		return findBySubmenuName(submenu.getSubmenuName()) != null;
//	}

}
