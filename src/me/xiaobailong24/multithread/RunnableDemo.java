package me.xiaobailong24.multithread;

/**
 * 通过实现 Runnable 接口创建线程 如果你的类想要作为一个线程被执行，那么你可以通过实现 Runnable
 * 接口来到达这个目的。你将需要遵从三个基本步骤：
 * 
 * 步骤一：
 * 
 * 作为第一步你需要实现由 Runnable 接口提供的 run() 方法。这个方法为线程提供了进入点并且你将把你完全的业务逻辑放入方法中。下列是简单的
 * run() 方法语法：
 * 
 * public void run( )
 * 
 * 步骤二：
 * 
 * 在第二步你将使用以下的构造函数实例化一个 Thread 对象:
 * 
 * Thread(Runnable threadObj, String threadName); threadObj 是实现 Runnable
 * 接口的类的一个实例，threadName 是给新线程的名字。
 * 
 * 步骤三：
 * 
 * 一旦 Thread 对象被创建，你可以通过调用 run() 方法的 start() 方法来开始它。以下是 start() 方法的简单语法：
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
