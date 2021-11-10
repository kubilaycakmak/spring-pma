package com.spring.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.pma.entity.Project;

public interface iProjectRepository extends CrudRepository<Project, Long> {
	
	@Override
	public List<Project> findAll();

}
