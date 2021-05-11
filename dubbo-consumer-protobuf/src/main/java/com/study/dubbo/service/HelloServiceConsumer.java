package com.study.dubbo.service;

import com.study.dubbo.api.HelloService;
import com.study.dubbo.api.proto.DemoServiceDubbo;
import com.study.dubbo.api.proto.HelloRequest;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceConsumer {

    @DubboReference
    private HelloService helloService;

    @DubboReference
    private DemoServiceDubbo.IDemoService demoService;

    public String sayHello(){
        return helloService.sayHello("normal");
    }


    public String protobuf(){
        HelloRequest protobuf = HelloRequest.newBuilder().setName("protobuf").build();
        return demoService.sayHello(protobuf).getMessage();
    }
}
