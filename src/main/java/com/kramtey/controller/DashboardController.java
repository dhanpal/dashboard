package com.kramtey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DashboardController {

	@GetMapping("/")
	String getAllDashboards() {
		return "Kramtey Solutions";
	}
}