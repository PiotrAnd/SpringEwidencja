package com.ewidencja.services.impl;

import com.ewidencja.model.Project;
import com.ewidencja.repo.ProjectRepository;
import com.ewidencja.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> listAllProject() {
        List<Project> result = new LinkedList<>();
        projectRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Optional<Project> getProjectaById(Integer id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project saveOrUpdateProject(Project project) {
        if (project != null) {
            return projectRepository.save(project);
        } else {
            throw new RuntimeException("Can't be null!!!");
        }
    }

    @Override
    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);

    }

}
