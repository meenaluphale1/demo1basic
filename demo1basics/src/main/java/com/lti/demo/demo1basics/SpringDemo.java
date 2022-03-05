package com.lti.demo.demo1basics;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Employee e1= (Employee) context.getBean("employee");
		System.out.println(e1);	
		e1.setEmpName("Sachin Tendulkar");
		Employee e2= (Employee) context.getBean("employee");
		System.out.println(e2);		
     
 
	}

}
