package c9_1;

import java.text.DecimalFormat;

public class C9_1 {

	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
	static public void SimpleFormat(String pattern, double value) {
		//ʵ����DecimalFormat����
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);		//�����ֽ��и�ʽ��
		System.out.println(value + " " + pattern + " " + output);
	}
	
	//ʹ��applyPattern()���������ֽ��и�ʽ��
	static public void UseApplyPattern(String pattern, double value) {
		//ʵ����DecimalFormat����
		DecimalFormat myFormat = new DecimalFormat();
		//����applyPattern()�������ø�ʽ��ģ��
		myFormat.applyPattern(pattern);
		System.out.println(value + " " + pattern
				+ " " + myFormat.format(value));
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		SimpleFormat("###,###.###", 123456.789);		//���þ�̬SimpleFormat()����
		SimpleFormat("00000000.###kg", 123456.789);		//�����ֺ���ϵ�λ
		//���ո�ʽģ���ʽ�����֣������ڵ�λ��0��ʾ
		SimpleFormat("000000.000", 123.78);
		//���þ�̬UseApplyPattern()����
		UseApplyPattern("#.###%", 0.789);				//������ת��Ϊ�ٷ�����ʽ
		//��С������ʽ��Ϊ��λ
		UseApplyPattern("###.##", 123456.789);
		//������ת��Ϊǧ������ʽ
		UseApplyPattern("0.00\u2030", 0.789);
	}

}
