package me.xiaobailong24.inherit.hasa;

public class Van extends Vehicle {
	@SuppressWarnings("unused")
	private Speed sp;

	public Van() {
//		super();
		System.out.println("Van");
		sp = new Speed();
	}

}
