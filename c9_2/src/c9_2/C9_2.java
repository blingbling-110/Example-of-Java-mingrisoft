package c9_2;

import java.text.DecimalFormat;

public class C9_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(2);		//���ý����ַ���Ϊ2
		String output = myFormat.format(123456.789);
		System.out.println("��������ÿ�������ַ���" + output);
		myFormat.setGroupingUsed(false);		//���ò��������ֽ��з���
		String output2 = myFormat.format(123456.789);
		System.out.println("���������ַ���" + output2);
	}

}
