
public class c3_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12F;
		char mychar = 10;
		double mydouble = 45.46546D;

		/*	�����������	*/
		System.out.println("byte����float�����ݽ���������Ϊ��" + (mybyte + myfloat));
		System.out.println("byte����int�����ݽ���������Ϊ��" + (mybyte * myint));
		System.out.println("byte����char�����ݽ���������Ϊ��" + (mybyte / mychar));
		System.out.println("double����char�����ݽ���������Ϊ��" + (mydouble + mychar));	
		
		/*	������ʧ	*/
		float pi = (float)3.1415926;
		System.out.println("pi:" + pi);
		int i = (int)pi;
		System.out.println("i:" + i);
		
		/*	��ֵԽ�����	*/
		byte b = (byte)129;
		System.out.println("b:" + b);
	}
}
