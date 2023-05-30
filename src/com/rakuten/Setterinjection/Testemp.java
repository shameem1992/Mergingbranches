package com.rakuten.Setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Testemp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeContext.xml");
		
		Employee stu = (Employee)context.getBean("empbean");
		stu.displayemployee();
		 
	    }
		

	}



