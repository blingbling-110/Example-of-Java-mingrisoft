package c9_8;

public class C9_8 {

	// 定义获取任意字符之间的随机字符
	public static char GetRndChar(char c1, char c2) {
		return (char)(c1 + Math.random() * (c2 - c1 + 1));
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		//获取a~z之间的随机字符
		System.out.println("任意小写字符：" + GetRndChar('a', 'z'));
		//获取A~Z之间的随机字符
		System.out.println("任意大写字符：" + GetRndChar('A', 'Z'));
		//获取0~9之间的随机字符
		System.out.println("0到9任意数字字符：" + GetRndChar('0', '9'));
	}

}
