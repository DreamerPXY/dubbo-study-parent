package com.study.dubbo.service.impl;

import com.study.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello :" + name + " !";
    }
}
