package c9_7;

public class C9_7 {
	/**
	 * ������������ķ���
	 * @param n1 ��ʼ��Χ����
	 * @param n2 ��ֹ��Χ����
	 * @return ����ķ�Χ������
	 */
	public static int GetOddNum(double n1, double n2) {
		// ����n1~n2֮��������
		int r = (int) (n1 + Math.random() * (n2 - n1));
		if (r % 2 == 0) {
			return r + 1;
		} else
			return r;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		System.out.println("����һ��2~32֮���������" + GetOddNum(2, 32));
	}

}
