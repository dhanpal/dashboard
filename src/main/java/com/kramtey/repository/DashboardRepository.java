package com.kramtey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kramtey.model.Dashboard;

public interface DashboardRepository extends JpaRepository<Dashboard, Long>{

	@Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
	public List<Dashboard> findAllByCategory(@Param("lastName") String category);
	
	@Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
	public Dashboard findOneByCategory(String category, Long id);
	
}
