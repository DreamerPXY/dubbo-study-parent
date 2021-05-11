
    package com.study.dubbo.api.proto;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@javax.annotation.Generated(
value = "by Dubbo generator",
comments = "Source: DemoService.proto")
public final class DemoServiceDubbo {
private static final AtomicBoolean registered = new AtomicBoolean();

private static Class<?> init() {
Class<?> clazz = null;
try {
clazz = Class.forName(DemoServiceDubbo.class.getName());
if (registered.compareAndSet(false, true)) {
    org.apache.dubbo.common.serialize.protobuf.support.ProtobufUtils.marshaller(
    com.study.dubbo.api.proto.HelloReply.getDefaultInstance());
    org.apache.dubbo.common.serialize.protobuf.support.ProtobufUtils.marshaller(
    com.study.dubbo.api.proto.HelloRequest.getDefaultInstance());
}
} catch (ClassNotFoundException e) {
// ignore
}
return clazz;
}

private DemoServiceDubbo() {}

public static final String SERVICE_NAME = "com.study.dubbo.api.DemoService";

/**
* Code generated for Dubbo
*/
public interface IDemoService {

static Class<?> clazz = init();

    com.study.dubbo.api.proto.HelloReply sayHello(com.study.dubbo.api.proto.HelloRequest request);

    CompletableFuture<com.study.dubbo.api.proto.HelloReply> sayHelloAsync(com.study.dubbo.api.proto.HelloRequest request);


}

}
