package com.nanoframe.spring4.ch1.ioc.java;

import org.springframework.stereotype.Service;

/**
 * 能够被spring容器发现
 * spring容器启动后会创建一个FunctionService实例,相当于：FunctionService functionService = new FunctionService();
 * 使用@Service声明FunctionService 是Spring容器管理的bean
 * -@Service: 功能同：@Component @Controller @Repository
 * --@Component：没有明确的角色
 * --@Service：在业务逻辑层（services层）使用
 * --@Controller：在控制层使用（MVC-SpringMVC）
 * --@Repository：在数据访问层（dao层）使用
 *
 * @author lszhen
 * @Date 2018/3/7.
 */
public class FunctionService {
    public String sayHello(String word) {
        return "hello " + word;
    }
}
