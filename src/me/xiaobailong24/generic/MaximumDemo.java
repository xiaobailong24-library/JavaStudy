package me.xiaobailong24.generic;

public class MaximumDemo {

	public static void main(String[] args) {
		System.out.printf("Max of %d, %d, and %d is %d\n\n", 3, 4, 5,
				maximum(3, 4, 5));
		System.out.printf("Max of %.1f, %.1f, and %.1f is %.1f\n\n", 6.6, 7.7,
				8.8, maximum(6.6, 7.7, 8.8));
		System.out.printf("Max of %s, %s, and %s is %s\n\n", "pear", "apple",
				"orange", maximum("pear", "apple", "orange"));
	}

	// 受限的类型参数
	// 声明一个有限的类型参数，列举类型参数的名字，后面跟着扩展关键字和它的上界。
	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(y) > 0) {
			max = z;
		}
		return max;

	}
}
