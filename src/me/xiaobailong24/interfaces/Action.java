package me.xiaobailong24.interfaces;

/**
 * 一个内部没有任何方法的接口被称为 tagging interface。 tagging interface 有两个基本的用途：
 * 
 * 创建一个共同的父类： 像 EventListener 接口， 它继承了很多 Java API 中的其它接口，你可以使用 tagging interface
 * 在一组接口中创建一个共同的父类。例如，当一个接口继承了 EventListener 接口的时候， Java
 * 虚拟机（JVM）就知道这个特殊的接口被用在事件代理上。
 * 
 * 向类添加数据类型： 一个实现了 tagging interface
 * 的类是不需要定义任何方法的（因为这个接口中本来就没有任何方法），但是这个类通过多态的特性变成了一个接口类型。
 * 
 * @author LiuYinlong
 *
 */
public class Action {

}
