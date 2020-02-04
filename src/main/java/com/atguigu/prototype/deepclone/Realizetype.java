package com.atguigu.prototype.deepclone;

public class Realizetype implements Cloneable {
    Realizetype(){
        System.out.println("具体原型创建成功！");
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
