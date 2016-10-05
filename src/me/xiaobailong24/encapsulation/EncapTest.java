package me.xiaobailong24.encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setName("Kobe");
		e.setIdNum("24");
		e.setAge(37);

		System.out.println("Name: " + e.getName() + ",IdNum: " + e.getIdNum()
				+ ",Age: " + e.getAge());
	}

}
