package com.hamza.springboot.training.restcrudemployee.dao;

import com.hamza.springboot.training.restcrudemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee , Integer> {

}
