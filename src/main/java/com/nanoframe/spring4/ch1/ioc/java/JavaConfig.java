package com.nanoframe.spring4.ch1.ioc.java;

import com.nanoframe.spring4.ch1.ioc.annotation.FunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于java的配置，功能同xml配置和注解配置
 * -@Configuration：声明当前类是配置类
 * 没有使用包扫描的原因：所有的Bean都在此类中定义了
 * -@Bean：声明当前方法
 * @author lszhen
 * @date 2018/3/7.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
