package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前项目目录中的所有子项?
        File dir = new File(".");
        /*
            list:列表

            File常用方法:
            boolean isFile()
            判断当前File对象表示的是否为一个文件

            boolean isDirectory()
            判断当前File对象表示的是否为一个目录

            File[] listFiles()
            获取当前File对象表示的目录中的所有子项。返回的数组中每一个元素(一个File对象)表示
            该目录中的其中一个子项。
         */
        if(dir.isDirectory()){//布尔值表达式
            File[] subs = dir.listFiles();
            System.out.println("一共有:"+subs.length+"个子项");
            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }



    }
}
