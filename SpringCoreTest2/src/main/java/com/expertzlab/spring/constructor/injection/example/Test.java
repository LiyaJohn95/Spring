package com.expertzlab.spring.constructor.injection.example;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("bean-conf2.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Student s=(Student)factory.getBean("student1");  
        s.show();  
        
    }  
}  