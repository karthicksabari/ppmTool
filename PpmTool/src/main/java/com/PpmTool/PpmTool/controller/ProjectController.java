package com.PpmTool.PpmTool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PpmTool.PpmTool.Entity.Project;
import com.PpmTool.PpmTool.service.ProjectService;
import com.PpmTool.PpmTool.service.ValidationMSG;

import jakarta.validation.Valid;

@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private ValidationMSG validationMSG;

	@PostMapping("/DEMO")
	public ResponseEntity<?> sdEMO(@RequestBody Project project, BindingResult bindingResult) {
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Project project, BindingResult bindingResult) {

		ResponseEntity<?> entity = validationMSG.validateMsg(bindingResult);
		if (entity != null) {
			return entity;
		}
		projectService.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}


	@GetMapping("/{id}")
	public ResponseEntity<?> readProjectByIdent(@PathVariable String id){
		Project project = projectService.readProjectByIdent(id);
		if(project == null) {
			return new ResponseEntity("the projectIdentifier '"+id+"' does not exists. ",HttpStatus.OK);
		}
		return new ResponseEntity(project,HttpStatus.OK);
	}
	
	
	@GetMapping("/getAll")
	public ResponseEntity<?> readAllProject(){
		return new ResponseEntity(projectService.readAllProject() , HttpStatus.OK);
	}
	
	/**
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable String id){
		projectService.deleteById(id);
		
		return new ResponseEntity("the projectIdentifier '"+id+"' deleted successfully. ",HttpStatus.OK);
	}

}
