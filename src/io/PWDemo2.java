package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos = new FileOutputStream("pw2.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);

        Scanner sca = new Scanner(System.in);
        while (true){
            System.out.println("请输入：");
            String str = sca.nextLine();
            if ("exit".equals(str)){
                break;
            }else {
                pw.println(str);
                System.out.println("写出完毕");
            }
            pw.close();
        }

    }
}
