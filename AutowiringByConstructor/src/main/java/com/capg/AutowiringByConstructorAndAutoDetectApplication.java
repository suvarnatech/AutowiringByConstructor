package com.capg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.model.Employee;

@SpringBootApplication
public class AutowiringByConstructorAndAutoDetectApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);
	}

}
