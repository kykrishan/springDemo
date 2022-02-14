package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
class DemoApplicationTests {
	Student student=new Student();
	@Autowired
	private Books books;
	@Test
	void id() {
		student.setId(100);
assertEquals(100,student.getId());
	}
	@Test
	void name() {
		student.setName("hello");
		assertEquals("hello",student.getName());
	}
	@Test
	void lastName() {
		student.setLastName("world");
		assertEquals("world",student.getLastName());
	}
	@Test
	void show(){
		assertEquals(100,student.show());
	}

}
