package me.xiaobailong24.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * ����Ϊ���̣߳����ڷ���� 
 * 
 * @author LiuYinlong
 *
 */
public class ServerThread implements Runnable {
	private Socket client = null;

	public ServerThread(Socket client) {
		this.client = client;
	}

	public static void excute(Socket client) {
		try {
			// ��ȡSocket���������������ͻ��˷�������
			PrintStream out = new PrintStream(client.getOutputStream());
			// ��ȡSocket�����������������մӿͻ��˷��͹���������
			BufferedReader buf = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			boolean flag = true;
			while (flag) {
				// ���մӿͻ��˷��͹���������
				String str = buf.readLine();
				if (str == null || "".equals(str)) {
					flag = false;
				} else {
					if ("bye".equals(str)) { // Bye
						flag = false;
					} else {
						// �����յ����ַ���ǰ���echo�󷢻ص��ͻ���
						out.println("echo:" + str);
					}
				}
			}
			out.close();
			buf.close();
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		excute(client);
	}

}
