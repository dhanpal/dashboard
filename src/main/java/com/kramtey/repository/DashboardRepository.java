package com.kramtey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kramtey.model.Dashboard;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Long>{

//	@Query("SELECT p FROM Dashboard p WHERE LOWER(p.objectType) = LOWER(:objectType)")
//	public List<Dashboard> findAllByCategory(@Param("objectType") String category);
//	
//	@Query("SELECT p FROM Dashboard p WHERE LOWER(p.objectType) = LOWER(:objectType) AND (p.id) = (:id)")
//	public Dashboard findOneByCategory(@Param("objectType") String category, @Param("id") Long id);
//	
}
