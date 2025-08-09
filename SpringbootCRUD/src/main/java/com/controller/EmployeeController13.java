package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.beanfiles.Employeepojo13;
import com.daoservice.Employee13;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController13 {

    @Autowired
    private Employee13 service;

    @PostMapping("/user")
    public Employeepojo13 saveUser(@RequestBody Employeepojo13 employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/user")
    public List<Employeepojo13> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/user/{id}")
    public Object getUser(@PathVariable int id) {
        Employeepojo13 emp = service.getEmployeeById(id);
        if (emp == null) {
            return new ErrorMessage("User with id " + id + " not found");
        }
        return emp;
    }

    @PutMapping("/user/{id}")
    public Object updateUser(@PathVariable int id, @RequestBody Employeepojo13 emp) {
        Employeepojo13 updated = service.updateEmployee(id, emp);
        if (updated == null) {
            return new ErrorMessage("User with id " + id + " not found");
        }
        return updated;
    }

    @DeleteMapping("/user/{id}")
    public Object deleteUser(@PathVariable int id) {
        boolean deleted = service.deleteEmployee(id);
        if (!deleted) {
            return new ErrorMessage("User with id " + id + " not found");
        }
        return "Deleted successfully!";
    }

    static class ErrorMessage {
        private String errorMessage;
        public ErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }
        public String getErrorMessage() {
            return errorMessage;
        }
    }
}
