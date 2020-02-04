package com.atguigu.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        JdkInvocation invocation = new JdkInvocation();
        invocation.setTagServiceObject(new TagServiceImpl());
        TagService service = (TagService) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[] { TagService.class }, invocation);

        service.printSomeThing();
        System.out.println(service);

    }
}
