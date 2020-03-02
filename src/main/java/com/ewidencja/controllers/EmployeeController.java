package com.ewidencja.controllers;


import com.ewidencja.model.Employee;
import com.ewidencja.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public String getEmployees(Model model){
        model.addAttribute("employees", employeeService.listAllEmployee());
        return "employees";
    }

    @RequestMapping("/employee/{id}")
    public String showEmployee(@PathVariable Integer id, Model model) {
        Optional<Employee> employeeOpt = employeeService.getEmployeeaById(id);
        employeeOpt.ifPresent(employee -> model.addAttribute("employee", employee));
        return "employee";
    }

    @RequestMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){
       employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

    @RequestMapping("/employee/edit/{id}")
    public String editEmployee(@PathVariable Integer id, Model model){
        model.addAttribute("employee", employeeService.getEmployeeaById(id));
        return "employeeForm";
    }

    @RequestMapping("/employee/new")
    public String newEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }

    @PostMapping("/employee")
    public String saveOrUpdateEmployee(Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return "redirect:/employees/";
    }


}

