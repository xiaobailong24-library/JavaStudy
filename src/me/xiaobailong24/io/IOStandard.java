package me.xiaobailong24.io;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Standard Input���������������ݷ������û��ĳ���ͨ��������Ϊ��׼���������ұ�ʾΪ System.in�� Standard
 * Output��������������û�������������ݣ�ͨ��������Ļ��Ϊ��׼����������ұ�ʾΪ System.out�� Standard
 * Error��������������û������Ĵ������ݣ�ͨ��������Ļ��Ϊ��׼�����������ұ�ʾΪ System.err��
 * 
 * @author LiuYinlong
 *
 */
public class IOStandard {

	public static void main(String[] args) throws IOException {
		InputStreamReader cin = null;

		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit.");
			char c;
			do {
				c = (char) cin.read();
				System.out.println(c);
			} while (c != 'q');
		} finally {
			if (cin != null) {
				cin.close();
			}
		}
	}

}
