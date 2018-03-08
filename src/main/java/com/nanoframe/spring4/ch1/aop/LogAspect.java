package com.nanoframe.spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * TODO execution表达式
 * TODO joinPoint
 * TODO MethodSignature
 * @author lszhen
 * @date 2018/3/7.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.nanoframe.spring4.ch1.aop.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("执行后执行：注解式拦截，actionName = "+action.name());
    }

    @Before("execution(* com.nanoframe.spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("执行前先执行：mentod拦截，methodName = "+method.getName());
    }
}
