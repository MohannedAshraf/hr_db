package com.firstinnewcourse.first.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

     @PostMapping ("/save-emp")
    public Employee save(@RequestBody Employee emp){
        return empService.save(emp);
    }

    @DeleteMapping  ("/delete-emp")
    public void delete (@RequestParam Integer id){
        empService.delete(id);
    }

     @PostMapping ("/update-emp")
    public Employee update(@RequestBody Employee emp){
        return empService.save(emp);
    }
    @GetMapping ("/get-all-emp")
    public List<Employee> getAllUser(){
        return this.empService.getAll();
    } 


}
