package com.phoenix.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.phoenix.di.performers.Performer;

@SpringBootApplication
public class DependencyInjectionGradleApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionGradleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		
		Performer p = context.getBean("Deep_Patel", Performer.class);
		p.perform();
	}

}
