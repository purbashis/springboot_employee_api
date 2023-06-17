package com.pubashis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pubashis.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
