package me.xiaobailong24.encapsulation;

/**
 * 封装是一种可以使类中的字段私有并能通过公有方法来访问私有字段的技术。 如果一个字段被声明为私有，它就不能在类的外部被访问，从而隐藏了类内部的字段。
 * 基于这个原因，封装有时也被称为数据隐藏。
 * 
 * 封装可以被认为是一种能够保护代码和数据被定义在类外的其它代码任意访问的屏障。访问数据和代码由一个接口严格控制。
 * 
 * 封装的主要好处是修改我们实现的代码而又不会破坏其他人使用我们的代码。封装的这个特性使我们的代码具有可维护性、灵活性以及扩展性。
 * 
 * 封装的优点 :
 * 
 * 类中的字段可以被设置为只读或只写。
 * 
 * 类可以完全控制它字段里面所存储的东西。
 * 
 * 类的使用者不用知道类是如何存储数据的。类可以改变字段的数据类型而类的使用者不需要改变任何之前的代码。
 * 
 * @author LiuYinlong
 *
 */
public class Encapsulation {

	private String name;
	private String idNum;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Encapsulation() {
		System.out.println("Constructor: Encapsulation");
	}

}
