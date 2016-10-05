package me.xiaobailong24.serializable;

import java.io.Serializable;

/**
 * 然而在实际开发过程中，我们常常会遇到这样的问题，这个类的有些属性需要序列化，而其他属性不需要被序列化， 打个比方，如果一个用户有一些敏感信息（如密码,
 * 银行卡号等），为了安全起见，不希望在网络操作（主要涉及到序列化操作，本地序列化缓存也适用）中被传输，
 * 这些信息对应的变量就可以加上transient关键字。换句话说，这个字段的生命周期仅存于调用者的内存中而不会写到磁盘里持久化。
 * 
 * @author LiuYinlong
 */
public class Employee implements Serializable {

	/**
	 * 注意到为使一个类被成功序列化，两个条件必须被满足：
	 * 
	 * 类必须实现 java.io.Serializable 类。
	 * 
	 * 类中所有的字段必须被序列化。如果一个字段没有被序列化，它必须被标记为瞬态的。
	 */
	private static final long serialVersionUID = 1L;

	public String name;
	public String adress;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + adress);
	}
}
