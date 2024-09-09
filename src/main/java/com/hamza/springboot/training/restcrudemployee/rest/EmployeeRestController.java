package com.hamza.springboot.training.restcrudemployee.rest;


import com.hamza.springboot.training.restcrudemployee.dao.EmployeeDAO;
import com.hamza.springboot.training.restcrudemployee.entity.Employee;
import com.hamza.springboot.training.restcrudemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class EmployeeRestController {

    //private EmployeeDAO employeeDAO;

    private EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping ("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
