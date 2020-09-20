package com.ga.dao;

import com.ga.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName UserMapperImpl.java
 * @Description TODO
 * @createTime 2020年09月20日 17:58:00
 */
public class UserMapperImpl implements UserMapper {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    @Override
    public List<User> query() {
        return userMapper.query();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }


}
