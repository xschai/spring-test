package com.chai.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("user1")

@Scope("prototype")
public class User {
    @Value("琴江")
    public String name ;
}
