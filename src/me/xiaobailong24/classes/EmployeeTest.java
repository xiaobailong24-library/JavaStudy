package me.xiaobailong24.classes;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee empOne = new Employee("James");
		Employee empTwo = new Employee("Kobe");

		empOne.setAge(36);
		empOne.setDesignation("All Star");
		empOne.setSalary(100000);
		empOne.printEmployee();

		empTwo.setAge(32);
		empTwo.setDesignation("All Star");
		empTwo.setSalary(200000);
		empTwo.printEmployee();
	}

}
