package com.lab.capas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lab.capas.entity.Employee;

@Repository
public interface EmployeeRepositiry extends CrudRepository<Employee, Long> {


}

