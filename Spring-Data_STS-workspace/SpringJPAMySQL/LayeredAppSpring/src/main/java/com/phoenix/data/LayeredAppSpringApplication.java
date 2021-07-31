package com.phoenix.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.phoenix.data.repositories.EmployeesRepository;
import com.phoenix.entities.Employees;

@SpringBootApplication
@EntityScan("com.phoenix.entities")
public class LayeredAppSpringApplication implements CommandLineRunner{

	@Autowired
	private EmployeesRepository empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(LayeredAppSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Iterable<Employees> emp = empRepo.findAll();
		emp.forEach(System.out::println);
	}

}
