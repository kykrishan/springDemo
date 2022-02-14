package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//create obj in spring container
@Component
//to tell create only when needed
@Scope(value = "prototype")
public class Student {
	private String name;
	private int id;
	private String lastName;
	//to tell that there is a book obj in spring container,connect to it
	@Autowired
	private Books books;
	public Student(){
		System.out.println("Object Created");
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
	public int show() {
	return books.numberOfBooks();
	}

}
