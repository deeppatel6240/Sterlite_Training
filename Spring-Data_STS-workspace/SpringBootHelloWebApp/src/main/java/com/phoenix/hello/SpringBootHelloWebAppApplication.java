package com.phoenix.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWebAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

}
