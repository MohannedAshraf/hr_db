package com.firstinnewcourse.first.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstinnewcourse.first.model.entity.Employee;
import com.firstinnewcourse.first.service.EmpService;

@RestController 
@RequestMapping ("employees")
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @GetMapping ("/get-emp")
    public Employee getUser(@RequestParam Integer id){
        return empService.getUser(id);
    }
}
