package me.xiaobailong24.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException e2) {
			e2.printStackTrace();
			return;
		} catch (ClassNotFoundException e2) {
			System.out.println("Employee class not found.");
			e2.printStackTrace();
			return;
		}
		System.out.println("Deserilized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Adress: " + e.adress);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);
	}

}
