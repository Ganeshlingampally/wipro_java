package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beanfiles.Employeepojo13;

@Repository
public interface EmployeeRepository13 extends JpaRepository<Employeepojo13, Integer> {
}
