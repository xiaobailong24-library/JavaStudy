package me.xiaobailong24.polymorphism;

/**
 * ������ s.mailCheck() ����ʱ���������ڱ���ʱ���� mailCheck() �� Salary ���У����� JVM ������ʱ����
 * Salary��� mailCheck() ������
 * 
 * ���� e.mailCheck() �����в�ͬ����Ϊ e ��һ�� Employee �����á������������� e.mailCheck() ʱ,��������
 * Employee ���з��� mailCheck() ������
 * 
 * �����ڱ���ʱ,������ʹ�� Employee �� mailCheck() ��������֤��������ʱ��JVM ���� Salary ��� mailCheck()
 * �ࡣ
 * 
 * ������Ϊ����Ϊ�鷽�����ã��÷���Ҳ����Ϊ�鷽����Java
 * �����д˹���ķ�����Ϊ��������ʲô�������͵����ã�����ʱ����ñ����Ƿ������ڱ���ʱ������ѭ��Դ�롣
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
