package me.xiaobailong24.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream �౻�������л�һ����������� SerializeDemo ����ʵ������һ�� Employee
 * �����ҽ�����һ���ļ������л���
 * 
 * ������ִ����Ϻ�һ����Ϊ employee.ser ���ļ��ͱ������ˡ����������κ�����������о����벢��ͼȷ������������ʲô��
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
