package me.xiaobailong24.collection;

import java.util.Comparator;

public class Dog implements Comparable<Dog>, Comparator<Dog> {

	private String name;
	private int age;

	public Dog() {
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}

	@Override
	public int compareTo(Dog d) {
		return (this.name).compareTo(d.name);
	}

}
