package com.atguigu.prototype.deepclone;

public class Realizetype implements Cloneable {
    Realizetype(){
        System.out.println("����ԭ�ʹ����ɹ���");
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("����ԭ�͸��Ƴɹ���");
        return (Realizetype)super.clone();
    }
}
