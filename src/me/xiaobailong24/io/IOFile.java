package me.xiaobailong24.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 两个重要的流是 FileInputStream 和 FileOutputStream
 * 
 * @author LiuYinlong
 *
 */
public class IOFile {

	private static String FILE = "F:/file.txt";

	public static void main(String[] args) {
		try {
			// 把数据写入文件
			char[] bWrite = { '1', '2', '3', '4', '5' };
			OutputStream os = new FileOutputStream(FILE);
			for (char b : bWrite) {
				os.write(b);
			}
			os.close();

			// 从文件读取数据
			InputStream is = new FileInputStream(FILE);
			int size = is.available();
			for (int i = 0; i < size; i++) {
				System.out.print((char) (is.read()) + " ");
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
