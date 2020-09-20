package com.ga.dao;

import com.ga.entity.User;

import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName UserMapper.java
 * @Description TODO
 * @createTime 2020年09月20日 20:23:00
 */
public interface UserMapper {
    public List<User> query();

    public int addUser(User user);

    public int deleteUser(int id);

}
