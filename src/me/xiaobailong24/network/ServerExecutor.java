package me.xiaobailong24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * �����ʵ��3���̳߳صĴ�С��Ҫ���ݸ���������е�������ʹ�ͻ������ӵ�ʱ����̣�
 * ������������һ�����ȵĹ��ߣ�������ϵͳ��������ʱ��չ�̳߳صĴ�С�����ڴ�����ֵ�������ؼ���ʱ�����̳߳صĴ�С
 * �������ڷ����
 * ����ͨ��Executor�ӿ�ʵ�ַ�����
 */
public class ServerExecutor {
	public static final int SOCKET_PORT_2 = 20002;

	public static void main(String[] args) throws IOException {
		// ������� SOCKET_PORT_2 �˿ڼ�����ͻ��������TCP����
		ServerSocket server = new ServerSocket(SOCKET_PORT_2);
		Socket client = null;
		int i = 0;
		// ͨ������ Executors ��ľ�̬����������һ�� ExcutorsService ʵ��
		Executor service = Executors.newCachedThreadPool();
		boolean f = true;
		while (f) {
			// �ȴ��ͻ��˵�����
			System.out.println("������3�ȴ�����...");
			client = server.accept();
			System.out.println("������3��ͻ������ӳɹ�:" + ++i);
			// ���� execute() ����ʱ�������Ҫ�ᴴ��һ���µ��߳����������񣬵������Ȼ᳢��ʹ�����е��߳�
			// ���һ���߳̿��� 60s ���ϣ������Ƴ��̳߳أ�
			// ���⣬�������� Executor ���ڲ��Ŷӣ����������������Ŷӡ�
			service.execute(new ServerThread(client));
		}
		server.close();
	}
}
