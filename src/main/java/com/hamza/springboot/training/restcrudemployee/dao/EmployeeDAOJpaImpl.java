package com.hamza.springboot.training.restcrudemployee.dao;

import com.hamza.springboot.training.restcrudemployee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // define fields for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findall() {

        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return the results
        return employees;
    }
}
