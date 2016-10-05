package me.xiaobailong24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * �����ʵ��2��ͨ�������߳��������ظ�ʹ���߳�
 * �������ڷ����
 * ����˵Ĺ����ǽ���һ��ͨ���նˣ��������صȴ��ͻ��˵����ӡ�
 * ʵ�ֲ���:
 * 1. ��һ�ͻ�һ�̷߳�����һ�����̳߳ط��������ȴ���һ�� ServerSocket ʵ����
 * 2. Ȼ�󴴽� N ���̣߳�ÿ���̷߳���ѭ�����ӣ�����ģ�ServerSocket ʵ�����տͻ������ӡ�
 *    ������߳�ͬʱ����һ�� ServerSocket ʵ���� accept()����ʱ�����Ƕ��������ȴ���
 *    ֱ��һ���µ����ӳɹ�������Ȼ��ϵͳѡ��һ���̣߳�Ϊ������������ṩ���������߳�����������ȴ���
 * 3. �߳�����ɶ�һ���ͻ��˵ķ���󣬼����ȴ��������������󣬶�����ֹ�������һ���ͻ������ӱ�����ʱ��
 *	      û���߳��� accept()�����������������е��̶߳���Ϊ�������ӷ��񣩣�ϵͳ���µ�����������һ�������У�
 *    ֱ����һ�ε��� accept()������
 * @author LiuYinlong
 *
 */
public class ServerPool {
	private static final int THREAD_POOL_SIZE = 2;
	public static final int SOCKET_PORT_1 = 20001;

	public static void main(String[] args) throws IOException {
		// ������� SOCKET_PORT �˿ڼ����ͻ��������TCP����
		@SuppressWarnings("resource")
		final ServerSocket server = new ServerSocket(SOCKET_PORT_1);

		// ���̳߳���һ��ֻ�� THREADPOOLSIZE ���̣߳�
		// ����� THREADPOOLSIZE ���߳��� accept() �����������ȴ���������
		for (int i = 0; i < THREAD_POOL_SIZE; i++) {
			// �����ڲ��࣬��ǰ�߳�Ϊ�����̣߳���û��Ϊ�κοͻ��������ṩ����
			Thread thread = new Thread() {
				@Override
				public void run() {
					// �߳�Ϊĳ�����ṩ�����ѭ���ȴ�����������
					while (true) {
						try {
							// �ȴ��ͻ��˵�����
							System.out.println("������2�ȴ�����...");
							Socket client = server.accept();
							System.out.println("������2��ͻ������ӳɹ���");
							// һ�����ӳɹ������ڸ��̳߳�����ͻ���ͨ��
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
