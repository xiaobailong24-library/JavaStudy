package me.xiaobailong24.method;

public class Method {

	public static void main(String[] args) {
		int a = 30;
		int b = 45;

		System.out.println("a:" + a + ",b:" + b);
		swapFunc(a, b);
		System.out.println("a:" + a + ",b:" + b);
	}

	private static void swapFunc(int a, int b) {
		System.out.println("a:" + a + ",b:" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a:" + a + ",b:" + b);
	}

}
