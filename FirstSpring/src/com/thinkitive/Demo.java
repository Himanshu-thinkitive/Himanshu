package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
		
	
		Employee e=context.getBean("em",Employee.class);
		
		Address a=context.getBean(Address.class);
			System.out.println(e);
		
	
				
		 
			}
}