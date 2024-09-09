package com.hamza.springboot.training.restcrudemployee.service;


import com.hamza.springboot.training.restcrudemployee.dao.EmployeeDAO;
import com.hamza.springboot.training.restcrudemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {

        return employeeDAO.findall();
    }
}
