package me.xiaobailong24.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		/* Following is not allowed and would raise error */
		// Employee e = new Employee("Kobe", "Los Angles", 24);
		Salary s = new Salary("Kobe", "Los Angles", 24, 50000);
		Employee e = new Salary("James", "Cleveland", 23, 40000);

		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("Call mailCheck using Employee reference --");
		e.mailCheck();
	}

}
