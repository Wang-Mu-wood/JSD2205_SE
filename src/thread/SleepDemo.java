package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        for(int i = scanner.nextInt();i>0;i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("时间到!");


        System.out.println("程序结束了");
    }
}
