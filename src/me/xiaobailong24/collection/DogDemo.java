package me.xiaobailong24.collection;

import java.util.ArrayList;
import java.util.Collections;

public class DogDemo {

	public static void main(String[] args) {
		// Take a list o Dog objects
		ArrayList<Dog> list = new ArrayList<Dog>();

		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		Collections.sort(list); // sorts the array list

		for (Dog dog : list) {
			System.out.println(dog.getName() + ", ");
		}

		// Sorts the array list using comparator
		Collections.sort(list, new Dog());
		System.out.println(" ");

		for (Dog dog : list) {
			System.out.println(dog.getName() + " : " + dog.getAge() + ", ");
		}

	}

}
