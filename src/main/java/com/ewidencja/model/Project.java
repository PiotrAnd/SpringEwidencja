package com.ewidencja.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "project_name")
    @NotNull
    private String name;

    @Column(name = "description")
    @NotNull
    private String description;


    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "" +projectId;
    }
}
