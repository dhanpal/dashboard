package com.kramtey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kramtey.model.Tab;

@Repository
public interface TabRepository extends JpaRepository<Tab, Long> {

}
