package com.chai.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class User {
    @Resource
    private Cat cat;
    @Resource(name="dog2")
    private Dog dog;
    private String str;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", str='" + str + '\'' +
                '}';
    }
}
