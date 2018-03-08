package com.nanoframe.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @author lszhen
 * @date 2018/3/7.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("我是 DemoMethodService 的add方法");
    }
}
