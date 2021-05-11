package com.study.dubbo.service.impl;

import com.study.dubbo.api.proto.DemoServiceDubbo;
import com.study.dubbo.api.proto.HelloReply;
import com.study.dubbo.api.proto.HelloRequest;
import org.apache.dubbo.config.annotation.DubboService;
import java.util.concurrent.CompletableFuture;

@DubboService
public class HelloServiceProtoImpl implements DemoServiceDubbo.IDemoService{

    @Override
    public HelloReply sayHello(HelloRequest request) {
        System.out.println("请求用户的名字:" + request.getName());
        return HelloReply.newBuilder().setMessage("hello protobuf").build();
    }

    @Override
    public CompletableFuture<HelloReply> sayHelloAsync(HelloRequest request) {
        return CompletableFuture.completedFuture(sayHello(request));
    }
}