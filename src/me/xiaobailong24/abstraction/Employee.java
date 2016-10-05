package me.xiaobailong24.abstraction;

public abstract class Employee {
	private String name;
	private String adress;
	private int number;

	public Employee(String name, String adress, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.adress = adress;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Inside Employee comutePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " "
				+ this.adress);
	}

	public String toString() {
		return name + " " + adress + " " + number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	/**
	 * �������һ���ṩ�ض��������࣬��������Ҫ������������ʵ��ʵ�����������������ڸ����������������Ϊ����ġ�
	 * 
	 * ����һ�����󷽷����������:
	 * 
	 * ���һ�����к���һ�����󷽷��������Ҳ�ǳ���ġ�
	 * 
	 * �κ�һ��������븲��������󷽷������߼�����������Ϊ���󷽷���
	 */
	
	public abstract void  time();

}
