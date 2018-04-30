package com.kramtey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kramtey.model.Menu;
import com.kramtey.model.Submenu;
import com.kramtey.repository.MenuRepository;

public class MenuServiceImpl implements MenuService{

	@Autowired
	MenuRepository menuRepository;
	
	@Override
	public Menu findByMenuId(Long menuId) {
		return menuRepository.findByMenuId(menuId);
	}

	@Override
	public List<Submenu> findSubmenuByMenuId(Long menuId) {
		return menuRepository.findSubmenuIdByMenuId(menuId);
	}

}
