package me.xiaobailong24.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 该类为多线程，用于服务端 
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
			// 获取Socket的输出流，用来向客户端发送数据
			PrintStream out = new PrintStream(client.getOutputStream());
			// 获取Socket的输入流，用来接收从客户端发送过来的数据
			BufferedReader buf = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			boolean flag = true;
			while (flag) {
				// 接收从客户端发送过来的数据
				String str = buf.readLine();
				if (str == null || "".equals(str)) {
					flag = false;
				} else {
					if ("bye".equals(str)) { // Bye
						flag = false;
					} else {
						// 将接收到的字符串前面加echo后发回到客户端
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
