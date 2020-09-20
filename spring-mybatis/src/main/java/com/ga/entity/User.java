package com.ga.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020年09月20日 17:37:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String pwd;
}
