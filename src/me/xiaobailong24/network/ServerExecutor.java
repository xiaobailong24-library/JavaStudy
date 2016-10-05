package me.xiaobailong24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 服务端实现3：线程池的大小需要根据负载情况进行调整，以使客户端连接的时间最短，
 * 理想的情况是有一个调度的工具，可以在系统负载增加时扩展线程池的大小（低于大上限值），负载减轻时缩减线程池的大小
 * 该类用于服务端
 * 该类通过Executor接口实现服务器
 */
public class ServerExecutor {
	public static final int SOCKET_PORT_2 = 20002;

	public static void main(String[] args) throws IOException {
		// 服务端在 SOCKET_PORT_2 端口坚监听客户端请求的TCP连接
		ServerSocket server = new ServerSocket(SOCKET_PORT_2);
		Socket client = null;
		int i = 0;
		// 通过调用 Executors 类的静态方法，创建一个 ExcutorsService 实例
		Executor service = Executors.newCachedThreadPool();
		boolean f = true;
		while (f) {
			// 等待客户端的连接
			System.out.println("服务器3等待连接...");
			client = server.accept();
			System.out.println("服务器3与客户端连接成功:" + ++i);
			// 调用 execute() 方法时，如果必要会创建一个新的线程来处理任务，但它首先会尝试使用已有的线程
			// 如果一个线程空闲 60s 以上，则将其移出线程池；
			// 另外，任务是在 Executor 的内部排队，而不是在网络中排队。
			service.execute(new ServerThread(client));
		}
		server.close();
	}
}
