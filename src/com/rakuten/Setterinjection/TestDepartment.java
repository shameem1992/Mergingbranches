package com.rakuten.Setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestDepartment {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("departmentContext.xml");
		Department dpt = (Department)context.getBean("deptbean");
		dpt.displayRecords();

	}


}
