package com.hamza.springboot.training.restcrudemployee.dao;

import com.hamza.springboot.training.restcrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findall();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById (int theId);
}
