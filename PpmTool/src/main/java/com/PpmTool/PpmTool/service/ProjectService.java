package com.PpmTool.PpmTool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PpmTool.PpmTool.Entity.Project;
import com.PpmTool.PpmTool.projectException.ProjectException;
import com.PpmTool.PpmTool.repository.ProjectRepository;

import jakarta.transaction.Transactional;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	/**
	 * @param project
	 * @return
	 */
	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier());
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectException("the project ID '" + project.getProjectIdentifier() + "' already exists.");
		}
	};

	/**
	 * @param project
	 * @return
	 */
	public Project readProjectByIdent(String project) {
		Project project2 = projectRepository.findByProjectIdentifier(project);
		return project2;
	}

	/**
	 * @return
	 */
	public Iterable<Project> readAllProject() {
		return projectRepository.findAll();
	}

	/**
	 * @param id
	 * @return
	 */
	@Transactional
	public void deleteById(String id) {
		projectRepository.deleteAllByProjectIdentifier(id);
	}

}
