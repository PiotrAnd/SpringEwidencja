package com.ewidencja.repo;

import com.ewidencja.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
