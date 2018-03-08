package com.nanoframe.spring4.ch1.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lszhen
 * @date 2018/3/7.
 */
public class demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(IocConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHi("lszhen"));
        context.close();
    }
}
