package com.kramtey.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Submenu")
public class SubmenuController {
	
//	@Autowired
//	SubmenuServiceImpl submenuServiceImpl;
//	
//	@RequestMapping(value = "/submenu/{id}", method = RequestMethod.GET)
//	public ResponseEntity<?> getSubmenu(@PathVariable("id") long id) {
//		Submenu submennu = submenuServiceImpl.findBySubmenuId(id);
//		if (submennu == null) {
//			return new ResponseEntity(new CustomErrorType("Submenu with id " + id 
//					+ " not found"), HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Submenu>(submennu, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/submenu/", method = RequestMethod.POST)
//	public ResponseEntity<?> createSubmenu(@RequestBody Submenu submenu, UriComponentsBuilder ucBuilder) {
//		if (submenuServiceImpl.isSubmenuExist(submenu)) {
//			return new ResponseEntity(new CustomErrorType("Unable to create. A Submenu with name " + 
//			submenu.getSubmenuName() + " already exist."),HttpStatus.CONFLICT);
//		}
//		submenuServiceImpl.saveSubmenu(submenu);
//		return new ResponseEntity<String>(HttpStatus.CREATED);
//	}
}