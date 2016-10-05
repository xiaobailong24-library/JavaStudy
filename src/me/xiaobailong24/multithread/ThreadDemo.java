package me.xiaobailong24.multithread;


/**
 * 通过继承 Thread 类来创建线程 第二个创建线程的方法是创建一个通过使用以下两个简单步骤继承 Thread 类的新的类。这个方法在解决 Thread
 * 类中使用可行方法创建的多线程的问题上提供了更多的灵活性。
 * 
 * 步骤一：
 * 
 * 你将需要覆写 Thread 类中可用的 run()方法。这个方法为线程提供入口并且你将把你完全的业务逻辑放入方法中。以下是 run()方法的简单的语法。
 * 
 * public void run( )
 * 
 * 步骤二：
 * 
 * 一旦 Thread 对象被创建，你可以通过调用 run()方法的 start() 方法来开始它。以下是 start() 方法的简单语法：
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
