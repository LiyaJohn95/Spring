package com.expertzlab.spring.annotation.conf.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class businessConfig {
 
    @Bean(name="bussService")
    public MyBusinessService getBusinessService(){
        return new MyBusinessService();
    }
}