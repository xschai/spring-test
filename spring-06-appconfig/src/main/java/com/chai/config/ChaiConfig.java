package com.chai.config;

import com.chai.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chai.pojo")
public class ChaiConfig {

    @Bean
    public  User getUser(){
        return new User();
    }
}
