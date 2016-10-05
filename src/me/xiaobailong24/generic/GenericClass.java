package me.xiaobailong24.generic;

public class GenericClass<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericClass<Integer> integerClass = new GenericClass<Integer>();
		GenericClass<String> stringClass = new GenericClass<String>();

		integerClass.setT(new Integer(10));
		stringClass.setT(new String("Hello World!"));

		System.out.printf("Integer Value :%d\n\n", integerClass.getT());
		System.out.printf("String Value :%s\n\n", stringClass.getT());
	}

}
