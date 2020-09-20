package com.ga.mapper;

import com.ga.entity.User;

import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName UserMapper.java
 * @Description TODO
 * @createTime 2020年09月20日 17:50:00
 */
public interface UserMapper {
    public List<User> query();
}
