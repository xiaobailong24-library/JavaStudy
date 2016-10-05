package me.xiaobailong24.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java 字符流用于处理16位 unicode 的输入和输出. 最常用的类是， FileReader 和 FileWriter。
 * 
 * @author LiuYinlong
 *
 */
public class IOChar {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("F:/input.txt");
			out = new FileWriter("F:/output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
