package com.kramtey.service;

import java.util.List;

import com.kramtey.model.Menu;
import com.kramtey.model.Submenu;

public interface MenuService {

	Menu findByMenuId(Long menuId);
	
	List<Submenu> findSubmenuByMenuId(Long menuId);
}
