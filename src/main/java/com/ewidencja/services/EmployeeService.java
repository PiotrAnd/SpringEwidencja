package com.ewidencja.services;

import com.ewidencja.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> listAllEmployee();

    Optional<Employee> getEmployeeaById(Integer id);

    Employee saveOrUpdateEmployee(Employee employee);

    void deleteEmployee(Integer id);


}
