package me.xiaobailong24.multithread;

public class DisplayDemo implements Runnable {

	private String message;

	public DisplayDemo(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(message);
		}
	}

}
