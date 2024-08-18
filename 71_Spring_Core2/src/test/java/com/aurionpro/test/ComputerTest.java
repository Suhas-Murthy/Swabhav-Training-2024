package com.aurionpro.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.Computer;
import com.aurionpro.model.Harddisk;

public class ComputerTest { public static void main(String[] args) {
	
//  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");  
//  Harddisk harddisk = (Harddisk) context.getBean("harddisk","Harddisk.class");
//    Computer computer = (Computer) context.getBean("computer","Computer.class");
//    System.out.println(computer);
	
	
	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//	Harddisk harddisk = context.getBean("harddisk","Harddisk.class");
  Computer computer = (Computer) context.getBean(Computer.class); 
  System.out.println(computer);

}
}
