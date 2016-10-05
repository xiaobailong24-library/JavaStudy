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
	 * 如果你想一个提供特定方法的类，但是你想要在他的子类中实际实现这个方法，你可以在父类中声明这个方法为抽象的。
	 * 
	 * 声明一个抽象方法有两个结果:
	 * 
	 * 如果一个类中含有一个抽象方法，类必须也是抽象的。
	 * 
	 * 任何一个子类必须覆盖这个抽象方法，或者继续将它声明为抽象方法。
	 */
	
	public abstract void  time();

}
