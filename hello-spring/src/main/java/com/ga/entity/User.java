package com.ga.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020年09月20日 13:45:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private Address address;
    List<String> hobbies;
    Map<String,String> card;
}
