package com.nanoframe.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 * @author lszhen
 * @date 2018/3/7.
 */
@Service
public class DemoApplicationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){
        System.out.println("我是 DemoApplicationService 的add方法");
    }
}
