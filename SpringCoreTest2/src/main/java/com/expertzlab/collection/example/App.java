package com.expertzlab.collection.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-collection.xml");
    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println("List>>"+cust.getLists());
    	System.out.println("Set>>"+cust.getSets());
    	System.out.println("Map>>"+cust.getMaps());
    	System.out.println("Prop>>"+cust.getPros());
    }
}