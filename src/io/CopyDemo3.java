package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".");
//        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedInputStream bis = new BufferedInputStream(fis,1024*10);

        FileOutputStream fos = new FileOutputStream(".");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024*10);

        int d;

        long start = System.currentTimeMillis();
        while ((d= bis.read()) != -1){
            bos.write(d);
        }

        long end = System.currentTimeMillis();
        System.out.println("用时:"+(end-start)+"ms");

        fis.close();
        fos.close();
    }
}
