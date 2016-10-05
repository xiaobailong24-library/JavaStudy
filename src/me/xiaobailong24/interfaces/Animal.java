package me.xiaobailong24.interfaces;

/**
 * 除非实现了接口的类是抽象的,否则接口中的所有方法都需要在类中实现。
 * 
 * 不能实例化一个接口。
 * 
 * 接口不能包含构造方法。
 * 
 * 接口中的所有方法都是抽象的。
 * 
 * 接口不能包含实例变量。
 * 
 * 接口中唯一能出现的变量必须被同时声明为 static 和 final 。
 * 
 * 接口不能被类继承；它应该被类实现。 一个接口可以继承多个接口。
 * 
 * 
 * 接口有下述属性：
 * 
 * 接口默认就是抽象的。当需要声明一个接口的时候不需要使用 abstract 关键字。
 * 
 * 接口中的每个方法默认也是抽象的，所以 abstract 关键字也不需要。
 * 
 * 接口中的方法默认是 public 的。
 * 
 * @author LiuYinlong
 *
 */
public interface Animal {

	public void eat();

	public void travel();

}
