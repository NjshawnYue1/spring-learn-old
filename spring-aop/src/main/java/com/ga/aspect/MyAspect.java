package com.ga.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyAspect.java
 * @Description TODO
 * @createTime 2020年09月20日 16:55:00
 */
@Aspect
public class MyAspect {
    @Before("execution(* com.ga.service.UserService.*(..))")
    public void say(){
        System.out.println("之前");
    }
}
