package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//for need as a bean
@Component
//to tell create only when needed
@Scope(value = "prototype")
public class Student {
	private String name;
	private int id;
	private String lastName;
	public Student(){
		System.out.println("Onject Created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void show() {
		System.out.println("Connected Student");
	}

}
