package com.hamza.springboot.training.restcrudemployee.service;


import com.hamza.springboot.training.restcrudemployee.dao.EmployeeDAO;
import com.hamza.springboot.training.restcrudemployee.dao.EmployeeRepository;
import com.hamza.springboot.training.restcrudemployee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    //private EmployeeDAO employeeDAO;

//    @Autowired
//    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
//        employeeDAO = theEmployeeDAO;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//
//        return employeeDAO.findall();
//    }
//
//    @Transactional
//    @Override
//    public Employee findById(int theId) {
//        return employeeDAO.findById(theId);
//    }
//
//    @Transactional
//    @Override
//    public Employee save(Employee theEmployee) {
//        return employeeDAO.save(theEmployee);
//    }
//
//    @Transactional
//    @Override
//    public void deleteById(int theId) {
//        employeeDAO.deleteById(theId);
//    }

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee findById(int theId) {
        Optional <Employee> result = employeeRepository.findById(theId);
        Employee theEmployee = null;
        if (result.isPresent()){
            theEmployee = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - "+theId);
        }
        return theEmployee;
    }


    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }


    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
