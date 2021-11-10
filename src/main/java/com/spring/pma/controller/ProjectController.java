package com.spring.pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pma.dao.iProjectRepository;
import com.spring.pma.entity.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	iProjectRepository proRepo;

//	@RequestMapping("/new")
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		model.addAttribute("project", new Project());
		return "projects/new-project";
	}
	
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		//this is where we save to database
		proRepo.save(project);
		return "redirect:/";
	}
}
