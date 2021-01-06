package com.chai.service;

import com.chai.dao.UserDao;
import com.chai.dao.UserDaoimpl;

public class UserServiceimpl implements UserService{
    private  UserDao userDao;

    public void  setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
