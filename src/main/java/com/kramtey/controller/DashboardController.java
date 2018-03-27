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
import com.kramtey.model.Note;
import com.kramtey.repository.DashboardRepository;

@RestController
@RequestMapping("/api")
public class DashboardController {
	@Autowired
	DashboardRepository dashboardRepository;

	@GetMapping("/dashboard")
	public List<Dashboard> getAllNotes() {
		return dashboardRepository.findAll();
	}

	@GetMapping("/dashboard/{id}")
	public ResponseEntity<Dashboard> getDashboardById(@PathVariable(value = "id") Long id) {
		Dashboard dashboard = dashboardRepository.findOne(id);
		if(dashboard == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(dashboard);
	}

	@PostMapping("/dashboard")
	public Dashboard createDashboard(@Valid @RequestBody Dashboard dashboard) {
		return dashboardRepository.save(dashboard);
	}

	@PutMapping("/dashboard/{id}")
	public ResponseEntity<Dashboard> updateDashboard(@PathVariable(value = "id") Long id,
			@Valid @RequestBody Dashboard dashboard) {
		Dashboard dashboardDetails = dashboardRepository.findOne(id);
		if(dashboardDetails == null) {
			return ResponseEntity.notFound().build();
		}
		//TODO

		Dashboard updatedDashboard = dashboardRepository.save(dashboardDetails);
		return ResponseEntity.ok(updatedDashboard);
	}

	@DeleteMapping("/notes/{id}")
	public ResponseEntity<Dashboard> deleteNote(@PathVariable(value = "id") Long noteId) {
		Dashboard note = dashboardRepository.findOne(noteId);
		if(note == null) {
			return ResponseEntity.notFound().build();
		}

		dashboardRepository.delete(note);
		return ResponseEntity.ok().build();
	}
}
