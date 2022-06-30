package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO
 * IO:Input,Output 即：输入与输出
 *
 * JAVA IO用于我们程序可以和外界交换数据。用于与外界的数据进行读写操作的。
 *
 * java中将输入与输出比喻为"流":stream
 * 如何理解流:讲流想象为一个连接我们程序和另一端的"管道",在其中按照同一方向顺序移动的数据。
 *          有点像"水管"中向着统一方向流动的水。
 * 输入流:从外界向我们的程序中移动的方向，因此是用来获取数据的流，作用就是:读取操作
 * 输出流:写出操作
 * 注意:流是单向的，输入永远用来读，输出永远用来写。将来我们在实际开发中希望与程序交互的另一端
 * 互相发送数据时，我们只需要创建一个可以连接另一端的"流"，进行读写操作完成。
 *
 * java定义了两个超类，来规范所有的字节流
 * java.io.InputStream:所有字节输入流的超类(抽象类)，里面定义了读取字节的相关方法。
 *                     所有字节输入流都继承自它
 * java.io.OutputStream:所有字节输出流的超类(抽象类)，里面定义了写出字节的相关方法。
 *                      所有的字节输出流都继承自它
 *
 *
 * 文件流
 * java.io.FileInputStream和java.io.FileOutputStream
 * 作用是真实连接我们程序和文件之间的"管道"。其中文件输入流用于从文件中读取字节。而文件输出流则
 * 用于向文件中写入字节。
 *
 * 文件流是节点流
 * JAVA IO将流划分为两类:节点流和处理流
 * 节点流:俗称"低级流"，特点:真实连接我们程序和另一端的"管道"，负责实际读写数据的流
 *       文件流就是典型的节点流，真实连接我们程序与文件的"管道"，可以读写文件数据了。
 * 处理流:俗称"高级流"
 *       特点:
 *       1:不能独立存在(单独实例化进行读写操作不可以)
 *       2:必须连接在其他流上，目的是当数据"流经"当前流时，可以对其做某种加工操作，简化我们的工作、
 * 流的连接:实际开发中经常会串联一组高级流最终到某个低级流上，对数据进行流水线式的加工读写。
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向当前项目目录下的fos.dat文件里写入数据
        /*
            文件输出流常见的构造器
            FileOutputStream(String path)
            FileOutputStream(File file)

         */
        FileOutputStream fos = new FileOutputStream("./fos.dat");

//        File file = new File("./fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);
        /*
            OutputStream上定义了所有输出流都应当具备的写出操作:
            void write(int d)
            该方法的作用是写出1个字节，写出的是给定的int值对应的2进制的
            "低八位"。
         */
        /*
            int型的"1"对应的2进制:
            00000000 00000000 00000000 00000001

            fos.write(1)
            将整数1的2进制低八位写入到文件中
            00000000 00000000 00000000 00000001
                                       ^^^^^^^^
                                   写入文件的2进制部分

            当write方法执行完毕后，fos.dat文件中的内容为:
            00000001

        */
        fos.write(1);
        /*
            int型的"2"对应的2进制:
            00000000 00000000 00000000 00000010

            fos.write(2)
            将整数1的2进制低八位写入到文件中
            00000000 00000000 00000000 00000010
                                       ^^^^^^^^
                                   写入文件的2进制部分

            当write方法执行完毕后，fos.dat文件中的内容为:
            00000001 00000010

         */
        fos.write(2);
        System.out.println("写出完毕!");

        //流用完了应当关闭
        fos.close();
    }
}
