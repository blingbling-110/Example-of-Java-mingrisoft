
public class c3_4 {
	
	/*��Ա����*/
	static int age = 24;				//��̬������Ҳ���������
	final static float PI = 3.14F;		//��������PI����ʱ�粻��PI���и�ֵ�������ִ�����ʾ
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		age = 25;
		//PI = 3.1415F;			//����Ĵ��룬��ΪPIΪ������ֻ�ܽ���һ�θ�ֵ
		final int number;		//�ֲ�����
		number = 3;
		System.out.println("int�ͱ���age��ֵΪ��" + age);
		System.out.println("����PI��ֵΪ��" + PI);
		System.out.println("��ֵ��number��ֵΪ��" + number);
	}
	
}
