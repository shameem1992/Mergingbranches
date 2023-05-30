package com.rakuten.Setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestmapJersey {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mapjerseyContext.xml");
		
		MapJersey stu = (MapJersey)context.getBean("jerseybean");
		stu. displayTeam();
		 
	    }
		

	}




