package me.xiaobailong24.encapsulation;

/**
 * ��װ��һ�ֿ���ʹ���е��ֶ�˽�в���ͨ�����з���������˽���ֶεļ����� ���һ���ֶα�����Ϊ˽�У����Ͳ���������ⲿ�����ʣ��Ӷ����������ڲ����ֶΡ�
 * �������ԭ�򣬷�װ��ʱҲ����Ϊ�������ء�
 * 
 * ��װ���Ա���Ϊ��һ���ܹ�������������ݱ��������������������������ʵ����ϡ��������ݺʹ�����һ���ӿ��ϸ���ơ�
 * 
 * ��װ����Ҫ�ô����޸�����ʵ�ֵĴ�����ֲ����ƻ�������ʹ�����ǵĴ��롣��װ���������ʹ���ǵĴ�����п�ά���ԡ�������Լ���չ�ԡ�
 * 
 * ��װ���ŵ� :
 * 
 * ���е��ֶο��Ա�����Ϊֻ����ֻд��
 * 
 * �������ȫ�������ֶ��������洢�Ķ�����
 * 
 * ���ʹ���߲���֪��������δ洢���ݵġ�����Ըı��ֶε��������Ͷ����ʹ���߲���Ҫ�ı��κ�֮ǰ�Ĵ��롣
 * 
 * @author LiuYinlong
 *
 */
public class Encapsulation {

	private String name;
	private String idNum;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Encapsulation() {
		System.out.println("Constructor: Encapsulation");
	}

}
