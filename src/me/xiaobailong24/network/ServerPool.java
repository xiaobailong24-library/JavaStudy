package me.xiaobailong24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端实现2：通过限制线程总数并重复使用线程
 * 该类用于服务端
 * 服务端的工作是建立一个通信终端，并被动地等待客户端的连接。
 * 实现步骤:
 * 1. 与一客户一线程服务器一样，线程池服务器首先创建一个 ServerSocket 实例。
 * 2. 然后创建 N 个线程，每个线程反复循环，从（共享的）ServerSocket 实例接收客户端连接。
 *    当多个线程同时调用一个 ServerSocket 实例的 accept()方法时，它们都将阻塞等待，
 *    直到一个新的连接成功建立，然后系统选择一个线程，为建立起的连接提供服务，其他线程则继续阻塞等待。
 * 3. 线程在完成对一个客户端的服务后，继续等待其他的连接请求，而不终止。如果在一个客户端连接被创建时，
 *	      没有线程在 accept()方法上阻塞（即所有的线程都在为其他连接服务），系统则将新的连接排列在一个队列中，
 *    直到下一次调用 accept()方法。
 * @author LiuYinlong
 *
 */
public class ServerPool {
	private static final int THREAD_POOL_SIZE = 2;
	public static final int SOCKET_PORT_1 = 20001;

	public static void main(String[] args) throws IOException {
		// 服务端在 SOCKET_PORT 端口监听客户端请求的TCP连接
		@SuppressWarnings("resource")
		final ServerSocket server = new ServerSocket(SOCKET_PORT_1);

		// 在线程池中一共只有 THREADPOOLSIZE 个线程，
		// 最多有 THREADPOOLSIZE 个线程在 accept() 方法上阻塞等待连接请求
		for (int i = 0; i < THREAD_POOL_SIZE; i++) {
			// 匿名内部类，当前线程为匿名线程，还没有为任何客户端连接提供服务
			Thread thread = new Thread() {
				@Override
				public void run() {
					// 线程为某连接提供服务后，循环等待其他的请求
					while (true) {
						try {
							// 等待客户端的连接
							System.out.println("服务器2等待连接...");
							Socket client = server.accept();
							System.out.println("服务器2与客户端连接成功！");
							// 一旦连接成功，则在该线程池中与客户端通信
							ServerThread.excute(client);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

			};
			thread.start();

		}
	}

}
