package com.kramtey.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kramtey.model.Menu;
import com.kramtey.repository.MenuRepository;

public class MenuServiceImpl implements MenuService{

	@Autowired
	MenuRepository menuRepository;
	
	@Override
	public Menu findByMenuId(Long menuId) {
		return menuRepository.findByMenuId(menuId);
	}

}
