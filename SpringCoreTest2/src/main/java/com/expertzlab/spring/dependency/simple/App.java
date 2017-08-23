package com.expertzlab.spring.dependency.simple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//Resource r=new ClassPathResource("bean-conf.xml");  
       // BeanFactory factory=new XmlBeanFactory(r);  
       // HelloWorld obj = (HelloWorld) factory.getBean("helloBean");
    	
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-conf.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
    	//AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-conf.xml");
		//HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.sayHello();
		//context.registerShutdownHook();
		//((AbstractApplicationContext) context).registerShutdownHook();
    }
    
}
