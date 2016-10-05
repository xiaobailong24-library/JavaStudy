package me.xiaobailong24.generic;

/**
 * 所有的泛型方法声明在方法的返回值之前(下一个例子中的)有一个由尖括号分隔开的类型参数区域。()
 * 类型参数能被用来声明返回类型和作为传给泛型方法的参数类型的占位符，就是为人所知的真正的类型参数。
 * 一个泛型方法的主体像其他方法声明一样。注意到类型参数仅能代表引用类型，而不是原始类型(就像 int,double 和 char)。
 * 
 * @author LiuYinlong
 *
 */
public class GenericMethodDemo {

	public static void main(String[] args) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray);

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);

		System.out.println("\nArray characterArray contains:");
		printArray(charArray);
	}

	// generic method printArray
	public static <E> void printArray(E[] inputArray) {
		// Display array elements
		for (E e : inputArray) {
			System.out.printf("%s ", e);
		}
		System.out.println();
	}

}
