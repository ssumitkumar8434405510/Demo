package com.project1.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.EMS.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
