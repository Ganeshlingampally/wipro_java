package com.daoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beanfiles.Employeepojo13;
import com.repository.EmployeeRepository13;
import com.beanfiles.Employeepojo13;
import com.beanfiles.Employeepojo13;
import com.repository.EmployeeRepository13;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;

@Service
public class Employee13 {

    @Autowired
    private EmployeeRepository13 repo;

    public List<Employeepojo13> getAllEmployees() {
        return repo.findAll();
    }

    public Employeepojo13 getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Employeepojo13 saveEmployee(Employeepojo13 employee) {
        return repo.save(employee);
    }

    public Employeepojo13 updateEmployee(int id, Employeepojo13 updatedEmp) {
        Employeepojo13 existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedEmp.getName());
            existing.setAge(updatedEmp.getAge());
            existing.setSalary(updatedEmp.getSalary());
            return repo.save(existing);
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}

