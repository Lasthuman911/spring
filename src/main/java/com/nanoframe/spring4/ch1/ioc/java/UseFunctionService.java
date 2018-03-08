package com.nanoframe.spring4.ch1.ioc.java;

import com.nanoframe.spring4.ch1.ioc.annotation.FunctionService;

/**
 * -@Autowired:将 FunctionService 的实例bean注入到 UseFunctionService 中
 * -@Autowired 功能同 @Inject （JSR-330） @Resource （JSR-250）
 * -可用于属性上或者set方法上，一般用在属性上，代码更少，层次清晰
 *
 * @author lszhen
 * @date 2018/3/7.
 */
public class UseFunctionService {

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    FunctionService functionService;

    public String sayHi(String word) {
        return functionService.sayHello(word);
    }
}
