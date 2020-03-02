package com.ewidencja.controllers;

import com.ewidencja.model.Project;
import com.ewidencja.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;


    @RequestMapping("/projects")
    public String getProject(Model model){
        model.addAttribute("projects", projectService.listAllProject());
        return "projects";
    }

    @RequestMapping("/project/{id}")
    public String showProject(@PathVariable Integer id, Model model) {
        Optional<Project> projectOpt = projectService.getProjectaById(id);
        projectOpt.ifPresent(project -> model.addAttribute("project", project));
        return "project";
    }

    @RequestMapping("/project/delete/{id}")
    public String deleteProject(@PathVariable Integer id){
        projectService.deleteProject(id);
        return "redirect:/projects";
    }

    @RequestMapping("/project/edit/{id}")
    public String editProject(@PathVariable Integer id, Model model){
        model.addAttribute("project", projectService.getProjectaById(id));
        return "projectForm";
    }

    @RequestMapping("/project/new")
    public String newproject(Model model){
        model.addAttribute("project", new Project());
        return "projectForm";
    }


    @PostMapping("/project")
    public String saveOrUpdateProject(Project project) {
        projectService.saveOrUpdateProject(project);
        return "redirect:/projects/";
    }
}
