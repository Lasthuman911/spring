package com.nanoframe.spring4.ch1.aop;

import com.nanoframe.spring4.ch1.ioc.java.JavaConfig;
import com.nanoframe.spring4.ch1.ioc.java.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lszhen
 * @date 2018/3/7.
 */
public class demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoApplicationService demoApplicationService = context.getBean(DemoApplicationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoApplicationService.add();
        demoMethodService.add();

        context.close();
    }
}
