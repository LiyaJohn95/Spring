package com.expertzlab.spring.annotation.conf.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfig {
 
    @Bean(name="jdbcService")
    public MyJdbcService getJdbcService(){
        return new MyJdbcService();
    }
}