package com.atguigu.strategy;

public class Client {

    public static void main(String[] args) {

        Context context =new Context(new MD5Strategy());
        context.encrypt();
    }
}
