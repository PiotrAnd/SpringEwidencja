package com.ewidencja.services.impl;

import com.ewidencja.model.Employee;
import com.ewidencja.repo.EmployeeRepository;
import com.ewidencja.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> listAllEmployee() {
        List<Employee> result = new LinkedList<>();
        employeeRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Optional<Employee> getEmployeeaById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee saveOrUpdateEmployee(Employee employee) {
        if (employee != null) {
            return employeeRepository.save(employee);
        } else {
            throw new RuntimeException("Can't be null!!!");
        }
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);

    }

    }

