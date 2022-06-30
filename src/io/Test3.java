package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 将io包下的每一个java文件内容都输出到控制台上。
 * 思路:
 * 1:利用File对象表示io目录，然后使用listFiles获取目录下的所有.java文件。
 *   可参考file包下的ListFilesDemo案例
 *
 * 2:遍历每一个java文件都用文件输入流读取并将内容转换为字符串输出到控制台即可。
 *   可参考ReadStringDemo案例
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File dir = new File("./src/io");
        if(dir.isDirectory()){
            //获取该目录下的所有java文件
            File[] subs = dir.listFiles(f->f.getName().endsWith(".java"));
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());

                FileInputStream fis = new FileInputStream(subs[i]);
                long len = subs[i].length();//通过file对象获取到文件的大小(字节量)
                System.out.println("文件大小:"+len);
                byte[] data = new byte[(int)len];//根据文件大小创建等长的字节数组
                fis.read(data);//块读取，一次性将文件所有数据读取到字节数组中
                //利用String的构造器，将字节数组中所有内容按照指定的UTF-8字符集还原为字符串
                String line = new String(data, StandardCharsets.UTF_8);
                System.out.println(line);
                fis.close();

            }
        }
    }
}


