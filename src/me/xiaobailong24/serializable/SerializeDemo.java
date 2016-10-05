package me.xiaobailong24.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream 类被用来序列化一个对象。下面的 SerializeDemo 程序实例化了一个 Employee
 * 对象并且将它在一个文件中序列化。
 * 
 * 当程序被执行完毕后，一个名为 employee.ser 的文件就被创建了。程序不生成任何输出，但是研究代码并试图确定程序是在做什么。
 * 
 * @author LiuYinlong
 *
 */
public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Kobe";
		e.adress = "Los Angles";
		e.SSN = 11122333;
		e.number = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serilized data is value in employee.ser");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
