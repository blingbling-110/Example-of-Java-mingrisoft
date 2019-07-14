package c9_11;

import java.math.BigDecimal;

public class C9_11 {

	static final int location = 10;

	/**
	 * ����ӷ�����������Ϊ�����뱻����
	 * 
	 * @param v1 ��ӵĵ�һ����
	 * @param v2 ��ӵĵڶ�����
	 * @return ����֮��
	 */
	public BigDecimal add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2);
	}

	/**
	 * �����������������Ϊ�����뱻����
	 * 
	 * @param v1 ������
	 * @param v2 ����
	 * @return ����֮��
	 */
	public BigDecimal sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2);
	}
	
	/**
	 * ����˷�����������Ϊ�����뱻����
	 * 
	 * @param v1 ��һ������
	 * @param v2 �ڶ�������
	 * @return ����֮��
	 */
	public BigDecimal mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2);
	}

	/**
	 * �����������������Ϊ�����뱻����
	 * 
	 * @param v1 ������
	 * @param v2 ����
	 * @return ����֮��
	 */
	public BigDecimal div(double v1, double v2) {
		return div(v1, v2, location);
	}
	public BigDecimal div(double v1, double v2, int scale) {
		if(scale < 0) {
			System.out.println("lֵ������ڵ���0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		//���ó�����������С�������scaleλ������������������������
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		C9_11 b = new C9_11();
		System.out.println("����������ӽ����" + b.add(-7.5, 8.9));
		System.out.println("����������������" + b.sub(-7.5, 8.9));
		System.out.println("����������˽����" + b.mul(-7.5, 8.9));
		System.out.println("�������������������С������10λ��" + b.div(10, 2));
		System.out.println("�����������������С����5λ��" + b.div(-7.5, 8.9, 5));
	}

}
