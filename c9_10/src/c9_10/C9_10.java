package c9_10;

import java.math.BigInteger;

public class C9_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		BigInteger n = new BigInteger("1995");		//ʵ����һ��������
		System.out.println("ȡ�ô����ּ�24��" + n.add(new BigInteger("24")));
		System.out.println("ȡ�ô����ּ�24��" + n.subtract(new BigInteger("24")));
		System.out.println("ȡ�ô����ֳ���24��" + n.multiply(new BigInteger("24")));
		System.out.println("ȡ�ô����ֳ���24��" + n.divide(new BigInteger("24")));
		System.out.println("ȡ�ô����ֳ���24���̣�" + 
				n.divideAndRemainder(new BigInteger("24"))[0]);
		System.out.println("ȡ�ô����ֳ���24��������" + 
				n.divideAndRemainder(new BigInteger("24"))[1]);
		System.out.println("ȡ�ô����ֵ�2�η���" + n.pow(2));
		System.out.println("ȡ�ô����ֵ��෴����" + n.negate());
	}

}
