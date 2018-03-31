package com.kramtey.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kramtey.model.Dashboard;
import com.kramtey.repository.DashboardRepository;

@RestController
@RequestMapping("/api/Notices")
public class NoticeController {
	private final String CATEGORY = "NOTICES";
	@Autowired
	DashboardRepository dashboardRepository;
	
	@GetMapping("/")
	public List<Dashboard> getAllNotices() {
		return dashboardRepository.findAllByCategory(CATEGORY);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Dashboard> getNoticedById(@PathVariable(value = "id") Long id) {
		Dashboard dashboard = dashboardRepository.findOneByCategory(CATEGORY, id);
		if(dashboard == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(dashboard);
	}

	@PostMapping("/")
	public Dashboard createDashboard(@Valid @RequestBody Dashboard dashboard) {
		return dashboardRepository.save(dashboard);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Dashboard> updateDashboard(@PathVariable(value = "id") Long id,
			@Valid @RequestBody Dashboard dashboard) {
		Dashboard dashboardDetails = dashboardRepository.findOne(id);
		if(dashboardDetails == null) {
			return ResponseEntity.notFound().build();
		}
		dashboardDetails.setRawData(dashboard.getRawData());
		Dashboard updatedDashboard = dashboardRepository.save(dashboardDetails);
		return ResponseEntity.ok(updatedDashboard);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Dashboard> deleteDashboard(@PathVariable(value = "id") Long id) {
		Dashboard dashboard = dashboardRepository.findOne(id);
		if(dashboard == null) {
			return ResponseEntity.notFound().build();
		}

		dashboardRepository.delete(dashboard);
		return ResponseEntity.ok().build();
	}
}
