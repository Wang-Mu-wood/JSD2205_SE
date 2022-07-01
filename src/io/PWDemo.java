package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("./pw.txt","utf-8");
        pw.println("如果你突然没打了个喷嚏，啊，那一定是我在想你。");
        pw.println("如果半夜被手机吵醒，啊，哪一定是我关心");
        System.out.println("写出完毕！");
        pw.close();
    }
}
