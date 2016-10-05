package me.xiaobailong24.overriding;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog");
	}

	@Override
	public void move() {
		super.move();
		System.out.println("Dogs can walk and run.");
	}

}
