package me.xiaobailong24.generic;

/**
 * ���еķ��ͷ��������ڷ����ķ���ֵ֮ǰ(��һ�������е�)��һ���ɼ����ŷָ��������Ͳ�������()
 * ���Ͳ����ܱ����������������ͺ���Ϊ�������ͷ����Ĳ������͵�ռλ��������Ϊ����֪�����������Ͳ�����
 * һ�����ͷ�����������������������һ����ע�⵽���Ͳ������ܴ����������ͣ�������ԭʼ����(���� int,double �� char)��
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
