package me.xiaobailong24.abstraction;

public class Salary extends Employee {
	private double salary;

	public Salary(String name, String adress, int number, double salary) {
		super(name, adress, number);
		setSalary(salary);

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0.0) {
			this.salary = salary;
		}

	}

	@Override
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary / 52;
	}

	@Override
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing check to " + getName() + " with salary "
				+ salary);
	}

	@Override
	public void time() {
		System.out.println("实现抽象方法");
	}

}
