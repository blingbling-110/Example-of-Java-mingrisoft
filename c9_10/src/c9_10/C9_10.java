package c9_10;

import java.math.BigInteger;

public class C9_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		BigInteger n = new BigInteger("1995");		//实例化一个大数字
		System.out.println("取该大数字加24：" + n.add(new BigInteger("24")));
		System.out.println("取该大数字减24：" + n.subtract(new BigInteger("24")));
		System.out.println("取该大数字乘以24：" + n.multiply(new BigInteger("24")));
		System.out.println("取该大数字除以24：" + n.divide(new BigInteger("24")));
		System.out.println("取该大数字除以24的商：" + 
				n.divideAndRemainder(new BigInteger("24"))[0]);
		System.out.println("取该大数字除以24的余数：" + 
				n.divideAndRemainder(new BigInteger("24"))[1]);
		System.out.println("取该大数字的2次方：" + n.pow(2));
		System.out.println("取该大数字的相反数：" + n.negate());
	}

}
