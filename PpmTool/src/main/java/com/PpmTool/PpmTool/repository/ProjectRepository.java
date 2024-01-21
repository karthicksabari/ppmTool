package com.PpmTool.PpmTool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PpmTool.PpmTool.Entity.Project;

import jakarta.transaction.Transactional;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	public Project findByProjectIdentifier(String project);

	@Transactional
	public void deleteAllByProjectIdentifier(String id);

}
