package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class,args);
		Student student=context.getBean(Student.class);
		System.out.println(student.show());
	}

}
