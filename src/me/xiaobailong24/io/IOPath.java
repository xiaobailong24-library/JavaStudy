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
	 * 创建目录: 1. mkdir( ) 方法创建了一个目录，成功返回 true ，创建失败返回
	 * false。失败情况是指文件对象的路径已经存在了,或者无法创建目录,因为整个路径不存在。 2. mkdirs( )
	 * 方法创建一个目录和它的上级目录。
	 */
	private static void createPath(String dirname) {
		File f = new File(dirname);
		if (f.mkdirs()) {
			System.out.println("创建成功:" + f.getPath());
		}
	}

	/**
	 * 用 File 对象提供的 list() 方法来列出目录中所有可用的文件和目录
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
