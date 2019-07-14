package c9_7;

public class C9_7 {
	/**
	 * 定义产生奇数的方法
	 * @param n1 起始范围参数
	 * @param n2 终止范围参数
	 * @return 随机的范围内奇数
	 */
	public static int GetOddNum(double n1, double n2) {
		// 产生n1~n2之间的随机数
		int r = (int) (n1 + Math.random() * (n2 - n1));
		if (r % 2 == 0) {
			return r + 1;
		} else
			return r;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println("任意一个2~32之间的奇数：" + GetOddNum(2, 32));
	}

}
