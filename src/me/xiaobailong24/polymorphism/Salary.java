package me.xiaobailong24.polymorphism;

public class Salary extends Employee {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0.0) {
			this.salary = salary;
		}
	}

	public Salary(String name, String adress, int number, double salary) {
		super(name, adress, number);
		setSalary(salary);
	}

	@Override
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class.");
		System.out.println("Mailing check to " + getName() + " with salary "
				+ salary);
	}

	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary / 52;
	}

}
