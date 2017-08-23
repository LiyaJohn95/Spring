package com.expertzlab.spring.dependency.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main (String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-conf.xml");
		Greeting greetingService= (Greeting) context.getBean("goodMorningBean");
		greetingService.greet();
	}
}
