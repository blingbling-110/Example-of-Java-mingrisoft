package c9_8;

public class C9_8 {

	// �����ȡ�����ַ�֮�������ַ�
	public static char GetRndChar(char c1, char c2) {
		return (char)(c1 + Math.random() * (c2 - c1 + 1));
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//��ȡa~z֮�������ַ�
		System.out.println("����Сд�ַ���" + GetRndChar('a', 'z'));
		//��ȡA~Z֮�������ַ�
		System.out.println("�����д�ַ���" + GetRndChar('A', 'Z'));
		//��ȡ0~9֮�������ַ�
		System.out.println("0��9���������ַ���" + GetRndChar('0', '9'));
	}

}
