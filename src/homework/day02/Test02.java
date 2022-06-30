package homework.day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 改正下面程序的错误
 * 
 * 程序实现的功能需求:复制一个文件
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_cp.txt");

		int d;
		while ((d = fis.read()) != -1) {
			fos.write(d);
		}
		System.out.println("复制完毕!");
		fis.close();
		fos.close();
	}
}




