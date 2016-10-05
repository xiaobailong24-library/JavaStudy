package me.xiaobailong24.io;

import java.io.File;

public class IOPath {

	public static void main(String[] args) {
		createPath("IO");
		createPath("IO/1");
		createPath("IO/2");
		createPath("IO/3");
		
		listPath("IO");
	}

	/**
	 * ����Ŀ¼: 1. mkdir( ) ����������һ��Ŀ¼���ɹ����� true ������ʧ�ܷ���
	 * false��ʧ�������ָ�ļ������·���Ѿ�������,�����޷�����Ŀ¼,��Ϊ����·�������ڡ� 2. mkdirs( )
	 * ��������һ��Ŀ¼�������ϼ�Ŀ¼��
	 */
	private static void createPath(String dirname) {
		File f = new File(dirname);
		if (f.mkdirs()) {
			System.out.println("�����ɹ�:" + f.getPath());
		}
	}

	/**
	 * �� File �����ṩ�� list() �������г�Ŀ¼�����п��õ��ļ���Ŀ¼
	 */
	private static void listPath(String dirname) {
		File f = null;
		String[] paths;

		try {
			f = new File(dirname);
			paths = f.list();

			for (String path : paths) {
				System.out.println(path);
			}
		} catch (Exception e) {
		}
	}

}
