package me.xiaobailong24.inherit.isa;

/**
 * ��õĹؼ���Ӧ��Ϊ extends �� implements��
 * 
 * @author LiuYinlong
 *
 */
public class IsA {

	public static void main(String[] args) {
		System.out.println("Create an Animal object:");
		@SuppressWarnings("unused")
		Animal a = new Animal();
		System.out.println("Create an Mammal object:");
		Mammal m = new Mammal();
		System.out.println("Create an Reptile object:");
		Reptile r = new Reptile();
		System.out.println("Create an Dog object:");
		Dog d = new Dog();

		System.out.println("Mammal is a Animal?" + (m instanceof Animal));
		System.out.println("Reptile is a Animal?" + (r instanceof Animal));
		System.out.println("Dog is a Animal?" + (d instanceof Animal));
		System.out.println("Dog is a Mammal?" + (d instanceof Mammal));
	}

}
