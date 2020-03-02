package com.ewidencja.services;

import com.ewidencja.model.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    List<Project> listAllProject();

    Optional<Project> getProjectaById(Integer id);

    Project saveOrUpdateProject(Project project);

    void deleteProject(Integer id);
}
