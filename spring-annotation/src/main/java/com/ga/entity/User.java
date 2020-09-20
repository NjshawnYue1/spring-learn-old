package com.ga.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020年09月20日 15:38:00
 */
@Data
@Component
public class User {
    private String name;
    private Integer age;
}
