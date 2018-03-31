package com.kramtey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kramtey.repository.DashboardRepository;

@RestController
@RequestMapping("")
public class DashboardController {
	@Autowired
	DashboardRepository dashboardRepository;

	@GetMapping("/")
	String getAllDashboards(ModelMap modal) {
		modal.addAttribute("title","Kramtey Solutions");
		return "index";
	}

	@GetMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		return page;
	}
}