package com.atguigu.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkInvocation implements InvocationHandler {

    private  Object object;

    public void setTagServiceObject(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("TargetService代理前");
        Object object=method.invoke(this.object,args);
        System.out.println("TargetService代理后");
        return object;
    }
}
