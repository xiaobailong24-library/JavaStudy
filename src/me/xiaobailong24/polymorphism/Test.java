package me.xiaobailong24.polymorphism;

/**
 * 当调用 s.mailCheck() 方法时，编译器在编译时发现 mailCheck() 在 Salary 类中，并且 JVM 在运行时调用
 * Salary类的 mailCheck() 方法。
 * 
 * 调用 e.mailCheck() 是略有不同的因为 e 是一个 Employee 的引用。当编译器发现 e.mailCheck() 时,编译器在
 * Employee 类中发现 mailCheck() 方法。
 * 
 * 这里在编译时,编译器使用 Employee 的 mailCheck() 方法来验证。在运行时，JVM 调用 Salary 类的 mailCheck()
 * 类。
 * 
 * 这种行为被称为虚方法调用，该方法也被称为虚方法。Java
 * 中所有此规则的方法行为，无论是什么数据类型的引用，运行时会调用被覆盖方法，在编译时都会遵循于源码。
 * 
 * @author LiuYinlong
 *
 */
public class Test {

	public static void main(String[] args) {
		// Deer d = new Deer();
		// Animal a = d;
		// Vegetarian v = d;
		// Object o = d;

		Salary s = new Salary("Kobe", "Los Angles", 24, 50000);
		Employee e = new Salary("James", "Cleveland", 23, 40000);

		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("Call mailCheck using Employee reference --");
		e.mailCheck();
	}
}
