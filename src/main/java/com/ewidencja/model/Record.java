package com.ewidencja.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recordId;
    @OneToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "work_time")
    @NotNull
    private String workTime;

    public Integer getRecordsId() {
        return recordId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordId = recordsId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

}
