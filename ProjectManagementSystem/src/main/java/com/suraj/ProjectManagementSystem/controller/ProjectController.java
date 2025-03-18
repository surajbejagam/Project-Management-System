package com.suraj.ProjectManagementSystem.controller;

import com.suraj.ProjectManagementSystem.dao.ProjectDAO;
import com.suraj.ProjectManagementSystem.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectDAO projectDAO;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/projects")
    public String listProjects(Model model) {
        List<Project> projects = projectDAO.getAllProjects();
        model.addAttribute("projects", projects);
        return "projects";
    }

    @GetMapping("/addProject")
    public String showAddProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "addProject";
    }

    @PostMapping("/saveProject")
    public String saveProject(@ModelAttribute("project") Project project) {
        projectDAO.saveProject(project);
        return "redirect:/projects";
    }
}

