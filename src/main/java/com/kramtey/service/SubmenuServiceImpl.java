package com.kramtey.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kramtey.model.Submenu;
import com.kramtey.repository.SubmenuRepository;

public class SubmenuServiceImpl implements SubmenuService{

	@Autowired
	SubmenuRepository submenuRepository;
	
	@Override
	public Submenu findBySubMenuId(Long submenuId) {
		return submenuRepository.findBySubmenuId(submenuId);
	}

}
