package me.xiaobailong24.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ʵ��1��ÿһ�������½�һ�����߳�
 * �������ڷ����
 * ���͵� TCP �����ִ����������������
 * 1. ����һ�� ServerSocket ʵ����ָ�����ض˿ڣ����������ͻ����ڸö˿ڷ��͵� TCP ��������
 * 2. �ظ�ִ�У�
 * 	  (1). ���� ServerSocket �� accept���������Ի�ȡ�ͻ������ӣ���ͨ���䷵��ֵ����һ�� Socket ʵ����
 *	  (2). Ϊ���ص� Socket ʵ�������µ��̣߳���ʹ�÷��ص� Socket ʵ���� I/O ����ͻ���ͨ�ţ� 
 *		         ͨ����ɺ�ʹ�� Socket ��� close���������رոÿͻ��˵��׽������ӡ�
 * @author LiuYinlong
 *
 */
public class ServerSingle {
	public static final int SOCKET_PORT_0 = 20000;
	
	public static void main(String[] args) throws IOException {
		//������� SOCKET_PORT_0 �˿ڼ����ͻ�������� TCP ����
		ServerSocket server = new ServerSocket(SOCKET_PORT_0);
		@SuppressWarnings("resource")
		Socket client = new Socket();
		boolean flag = true;
		int i = 0;
		while (flag) {
			//�ȴ��ͻ��˵����ӣ����û�л�ȡ����
			System.out.println("������1�ȴ�����...");
			client = server.accept();
			System.out.println("������1��ͻ������ӳɹ���"+ ++i);
			//Ϊÿ���ͻ��˿���һ���߳�
			new Thread(new ServerThread(client)).start();
		}
		server.close();
	}

}
