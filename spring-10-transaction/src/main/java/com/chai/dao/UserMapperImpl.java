package com.chai.dao;

import com.chai.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements  UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        User user = new User(18,"小明","123456");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(11);
        return mapper.selectUser();
    }

         public int addUser(User user) {
             UserMapper mapper = sqlSession.getMapper(UserMapper.class);
             return mapper.addUser(user);
         }

         public int deleteUser(int id) {
             UserMapper mapper = sqlSession.getMapper(UserMapper.class);
             return mapper.deleteUser(id);
         }
     }
