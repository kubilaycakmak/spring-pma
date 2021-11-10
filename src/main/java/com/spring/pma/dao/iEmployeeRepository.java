package com.spring.pma.dao;

import com.spring.pma.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface iEmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();

}
