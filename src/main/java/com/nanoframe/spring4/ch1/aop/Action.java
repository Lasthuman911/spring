package com.nanoframe.spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * TODO 注解
 * 注解本身是没有功能的，和xml一样，是一种元数据
 * @author lszhen
 * @date 2018/3/7.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
