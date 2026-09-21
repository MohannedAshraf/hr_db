package com.firstinnewcourse.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstinnewcourse.first.model.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
    
}
