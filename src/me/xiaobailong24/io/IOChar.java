package me.xiaobailong24.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java �ַ������ڴ���16λ unicode ����������. ��õ����ǣ� FileReader �� FileWriter��
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
