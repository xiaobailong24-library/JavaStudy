package me.xiaobailong24.io;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Standard Input：这是用来将数据反馈给用户的程序，通常键盘作为标准输入流并且表示为 System.in。 Standard
 * Output：这是用于输出用户程序产生的数据，通常电脑屏幕作为标准输出流，并且表示为 System.out。 Standard
 * Error：这是用来输出用户产生的错误数据，通常电脑屏幕作为标准错误流，并且表示为 System.err。
 * 
 * @author LiuYinlong
 *
 */
public class IOStandard {

	public static void main(String[] args) throws IOException {
		InputStreamReader cin = null;

		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit.");
			char c;
			do {
				c = (char) cin.read();
				System.out.println(c);
			} while (c != 'q');
		} finally {
			if (cin != null) {
				cin.close();
			}
		}
	}

}
