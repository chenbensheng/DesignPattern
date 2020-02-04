package com.atguigu.serial;

import java.io.*;

public class TestPersonSerialize {

    public static void main(String[] args) throws Exception{
        Person person = new Person();
        person.setName("����ʵ��");
        person.setAge(25);
        person.setSex("male");
        //serializePerson(person);
        Person p = deserializePerson();

        System.out.println(p.getName()+";"+p.getAge());
    }

   private static void serializePerson(Person person) throws IOException {

       ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
               new File("/Users/chenbensheng/Desktop/Person.txt")
       ));
       oo.writeObject(person);
       System.out.println("���л��ɹ�");
       oo.close();
   }

    private static Person deserializePerson() throws IOException, Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/chenbensheng/Desktop/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("�����л��ɹ�");
        return person;
    }

}
