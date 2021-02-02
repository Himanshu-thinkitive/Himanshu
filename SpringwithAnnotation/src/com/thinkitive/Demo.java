package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext("com.thinkitive");
		//ApplicationContext con=new AnnotationConfigApplicationContext();
		Employee e=con.getBean(Employee.class);
		
		System.out.println(e);
	}

}
