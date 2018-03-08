package com.nanoframe.spring4.ch1.ioc.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 基于注解的配置，功能同xml配置和java配置
 * -@Configuration：声明当前类是配置类
 * -@ComponentScan：扫描指定包下使用了Service @Component @Controller @Repository的类，注册为bean
 * 默认使用当前类所在的包，推荐使用方式2
 *
 * @author lszhen
 * @date 2018/3/7.
 */
@Configuration
//@ComponentScan("com.nanoframe.spring4.ch1.ioc.annotation") //方式1
//@ComponentScan(basePackageClasses = demo.class) //方式2
@ComponentScan
public class IocConfig {
}
