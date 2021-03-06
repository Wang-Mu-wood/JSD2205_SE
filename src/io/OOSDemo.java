package io;

import java.io.*;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "苍老师";
        int age = 55;
        String gender = "男";
        String[] otherInfo = {"你们的技术启蒙老师","拍片儿技术 一流","刘桑"};
        Person p = new Person(name,age,gender,otherInfo);

        FileOutputStream fos = new FileOutputStream("./person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p);
        System.out.println("写出完毕");

        oos.close();
    }
}
