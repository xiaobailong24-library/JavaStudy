package me.xiaobailong24.multithread;


/**
 * ͨ���̳� Thread ���������߳� �ڶ��������̵߳ķ����Ǵ���һ��ͨ��ʹ�����������򵥲���̳� Thread ����µ��ࡣ��������ڽ�� Thread
 * ����ʹ�ÿ��з��������Ķ��̵߳��������ṩ�˸��������ԡ�
 * 
 * ����һ��
 * 
 * �㽫��Ҫ��д Thread ���п��õ� run()�������������Ϊ�߳��ṩ��ڲ����㽫������ȫ��ҵ���߼����뷽���С������� run()�����ļ򵥵��﷨��
 * 
 * public void run( )
 * 
 * �������
 * 
 * һ�� Thread ���󱻴����������ͨ������ run()������ start() ��������ʼ���������� start() �����ļ��﷨��
 * 
 * void start( );
 * 
 * @author LiuYinlong
 *
 */
public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	public ThreadDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + "," + i);
				// let the thread sleep for a while
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + "interrupted");
		}
		System.out.println("Thread " + threadName + " exiting");
	}

	@Override
	public synchronized void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
