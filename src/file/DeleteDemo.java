package file;

import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {
        /*
       File file = new File("./test.txt");
       if (file.exists()){
           file.delete();
           System.out.println("该文件已删除");
       }else {
           System.out.println("该文件不存在");
       }

         */

        for (int i = 1; i <= 100; i++) {
            File file = new File("./test"+i+".txt");
            if (file.exists()){
                file.delete();
                System.out.println("已删除完毕");
            }else {
                System.out.println("该文件不存在");
            }
        }

    }
}
