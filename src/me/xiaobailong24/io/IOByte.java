package me.xiaobailong24.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Java �ֽ�������������8�����ֽڵ����������� 
 * ��õ��� FileInputStream ��� FileOutputStream ��
 * 
 * @author LiuYinlong
 *
 */

public class IOByte {

	public static void main(String[] args) throws IOException {
		// File input = new File("F:/input.txt");
		// File output = new File("F:/output.txt");

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("F:/input.txt");
			out = new FileOutputStream("F:/output.txt");

			int c;
			while ((c = in.read()) != -1) { // ������
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
