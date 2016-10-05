package me.xiaobailong24.serializable;

import java.io.Serializable;

/**
 * Ȼ����ʵ�ʿ��������У����ǳ������������������⣬��������Щ������Ҫ���л������������Բ���Ҫ�����л��� ����ȷ������һ���û���һЩ������Ϣ��������,
 * ���п��ŵȣ���Ϊ�˰�ȫ�������ϣ���������������Ҫ�漰�����л��������������л�����Ҳ���ã��б����䣬
 * ��Щ��Ϣ��Ӧ�ı����Ϳ��Լ���transient�ؼ��֡����仰˵������ֶε��������ڽ����ڵ����ߵ��ڴ��ж�����д��������־û���
 * 
 * @author LiuYinlong
 */
public class Employee implements Serializable {

	/**
	 * ע�⵽Ϊʹһ���౻�ɹ����л��������������뱻���㣺
	 * 
	 * �����ʵ�� java.io.Serializable �ࡣ
	 * 
	 * �������е��ֶα��뱻���л������һ���ֶ�û�б����л��������뱻���Ϊ˲̬�ġ�
	 */
	private static final long serialVersionUID = 1L;

	public String name;
	public String adress;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + adress);
	}
}
