package com.ga.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName People.java
 * @Description TODO
 * @createTime 2020年09月20日 15:01:00
 */
@Data
public class People {
    /**
     *
     *   此时这个属性可以为空 默认为true
     */
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;
}
