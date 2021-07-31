package com.phoenix.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.phoenix.entities.Employees;

@EnableJpaRepositories
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
