package com.firstinnewcourse.first.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstinnewcourse.first.model.entity.Employee;
import com.firstinnewcourse.first.repository.EmpRepo;

@Service 
public class EmpService {
    @Autowired 
     private EmpRepo empRepo;
     public Employee getUser(Integer id){

      Optional<Employee> emp = this.empRepo.findById(id);
      return emp.orElse(new Employee());
     }
    
}
