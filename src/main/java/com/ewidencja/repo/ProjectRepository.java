package com.ewidencja.repo;

import com.ewidencja.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
