package com.nanoframe.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * -@EnableAspectJAutoProxy 开启spring对AspectJ代理的支持
 * @author lszhen
 * @date 2018/3/7.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {
}
