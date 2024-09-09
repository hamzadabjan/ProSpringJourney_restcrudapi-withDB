package com.hamza.springboot.training.restcrudemployee.dao;

import com.hamza.springboot.training.restcrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findall();
}
