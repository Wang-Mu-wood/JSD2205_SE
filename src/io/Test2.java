package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 完成一个简易记事本工具
 * 程序启动后，将用户在控制台上输入的每一行字符串都写入到文件note.txt中。
 * 当用户单独输入"exit"时程序退出。
 *
 * 思路:
 * 用到的类:FileOutputStream,Scanner
 * 1:首先创建一个文件输出流，指定的文件为note.txt.目的是通过这个流向文件中写入数据
 * 2:循环进行如下操作
 *   2.1:首先获取用户在控制台上输入的一行字符串(Scanner的nextLine方法)
 *   2.2:判断字符串内容是否为exit,如果时则应退出循环
 *   2.3:如果不是exit,则将字符串写入到文件中
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./note.txt");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            //获取用户在控制台上输入的一行字符串
            String line = scanner.nextLine();
            if("exit".equalsIgnoreCase(line)){
                break;
            }
            //将输入的一行字符串转换为一组字节
            byte[] data = line.getBytes(StandardCharsets.UTF_8);
            //将这组字节写入到文件中
            fos.write(data);
        }
        System.out.println("再见!");
        fos.close();
    }
}
