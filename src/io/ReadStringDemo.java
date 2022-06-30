package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 使用文件流从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        //将当前源代码读取并输出到控制台上
        File file = new File("./src/io/ReadStringDemo.java");
        FileInputStream fis = new FileInputStream(file);
        long len = file.length();//通过file对象获取到文件的大小(字节量)
        System.out.println("文件大小:"+len);
        byte[] data = new byte[(int)len];//根据文件大小创建等长的字节数组
        fis.read(data);//块读取，一次性将文件所有数据读取到字节数组中
        //利用String的构造器，将字节数组中所有内容按照指定的UTF-8字符集还原为字符串
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
        fis.close();
    }
}
