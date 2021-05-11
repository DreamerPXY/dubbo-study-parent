package com.study.dubbo.controller;

import com.study.dubbo.service.HelloServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloServiceConsumer consumer;


    @RequestMapping("/test")
    public String test(){
        return consumer.sayHello();
    }


    @RequestMapping("/proto")
    public String proto(){
        return consumer.protobuf();
    }
}
