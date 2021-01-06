package com.chai.dao;

public class UserDaoMySqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("使用Mysql");
    }
}
