package c9_9;

import java.util.Random;

public class C9_9 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		Random r = new Random();		//ʵ����һ��Random��
		System.out.println("�������һ��������" + r.nextInt());
		System.out.println("�������һ�����ڵ���0С��10��������" 
				 + r.nextInt(10));
		System.out.println("�������һ�������͵�ֵ��" + r.nextBoolean());
		System.out.println("�������һ��˫�����͵�ֵ��" + r.nextDouble());
		System.out.println("�������һ�������͵�ֵ��" + r.nextFloat());
		System.out.println("�������һ�������ܶ�Ϊ��˹�ֲ���˫����ֵ��"
		+ r.nextGaussian());
	}

}
