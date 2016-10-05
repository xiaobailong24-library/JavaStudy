package me.xiaobailong24.polymorphism;

public class Employee {

	private String name;
	private String adress;
	private int number;

	public Employee(String name, String adress, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.adress = adress;
		this.number = number;
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

}
