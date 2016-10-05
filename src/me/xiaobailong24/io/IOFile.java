package me.xiaobailong24.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ������Ҫ������ FileInputStream �� FileOutputStream
 * 
 * @author LiuYinlong
 *
 */
public class IOFile {

	private static String FILE = "F:/file.txt";

	public static void main(String[] args) {
		try {
			// ������д���ļ�
			char[] bWrite = { '1', '2', '3', '4', '5' };
			OutputStream os = new FileOutputStream(FILE);
			for (char b : bWrite) {
				os.write(b);
			}
			os.close();

			// ���ļ���ȡ����
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
