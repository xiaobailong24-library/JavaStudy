package me.xiaobailong24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端实现1：每一个连接新建一个新线程
 * 该类用于服务端
 * 典型的 TCP 服务端执行如下两步操作：
 * 1. 创建一个 ServerSocket 实例并指定本地端口，用来监听客户端在该端口发送的 TCP 连接请求；
 * 2. 重复执行：
 * 	  (1). 调用 ServerSocket 的 accept（）方法以获取客户端连接，并通过其返回值创建一个 Socket 实例；
 *	  (2). 为返回的 Socket 实例开启新的线程，并使用返回的 Socket 实例的 I/O 流与客户端通信； 
 *		         通信完成后，使用 Socket 类的 close（）方法关闭该客户端的套接字连接。
 * @author LiuYinlong
 *
 */
public class ServerSingle {
	public static final int SOCKET_PORT_0 = 20000;
	
	public static void main(String[] args) throws IOException {
		//服务端在 SOCKET_PORT_0 端口监听客户端请求的 TCP 连接
		ServerSocket server = new ServerSocket(SOCKET_PORT_0);
		@SuppressWarnings("resource")
		Socket client = new Socket();
		boolean flag = true;
		int i = 0;
		while (flag) {
			//等待客户端的连接，如果没有获取连接
			System.out.println("服务器1等待连接...");
			client = server.accept();
			System.out.println("服务器1与客户端连接成功！"+ ++i);
			//为每个客户端开启一个线程
			new Thread(new ServerThread(client)).start();
		}
		server.close();
	}

}
