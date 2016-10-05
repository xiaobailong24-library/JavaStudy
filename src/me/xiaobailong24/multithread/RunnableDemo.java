package me.xiaobailong24.multithread;

/**
 * ͨ��ʵ�� Runnable �ӿڴ����߳� ����������Ҫ��Ϊһ���̱߳�ִ�У���ô�����ͨ��ʵ�� Runnable
 * �ӿ����������Ŀ�ġ��㽫��Ҫ��������������裺
 * 
 * ����һ��
 * 
 * ��Ϊ��һ������Ҫʵ���� Runnable �ӿ��ṩ�� run() �������������Ϊ�߳��ṩ�˽���㲢���㽫������ȫ��ҵ���߼����뷽���С������Ǽ򵥵�
 * run() �����﷨��
 * 
 * public void run( )
 * 
 * �������
 * 
 * �ڵڶ����㽫ʹ�����µĹ��캯��ʵ����һ�� Thread ����:
 * 
 * Thread(Runnable threadObj, String threadName); threadObj ��ʵ�� Runnable
 * �ӿڵ����һ��ʵ����threadName �Ǹ����̵߳����֡�
 * 
 * ��������
 * 
 * һ�� Thread ���󱻴����������ͨ������ run() ������ start() ��������ʼ���������� start() �����ļ��﷨��
 * 
 * void start( );
 * 
 * @author LiuYinlong
 *
 */
public class RunnableDemo implements Runnable {

	private Thread t;
	private String threadName;

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupt.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
