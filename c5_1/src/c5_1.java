
public class c5_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		/*	�ַ����в���""������	*/
		String str = "�ַ�������";
		System.out.println("str��\"\"��β������" + str.lastIndexOf(""));
		System.out.println("str��\"\"����������" + str.indexOf(""));
		System.out.println("str�ĳ��ȣ�" + str.length());
		System.out.println("�����Ҳ����򷵻أ�" + str.indexOf("abc"));
		
		/*	�����ַ����ļ��ַ���	*/
		char arr[] = {'��', '��', '��', '��'};
		String str1 = new String(arr);				//����һ��String(char a[])
		String str2 = new String(arr, 1, 2);		//��������String(char a[], int offset, int length)
		String str3 = new String("�ַ�����");		//��������String(char[] value)
		String str4;								//�����ַ���
		str4 = "�����ַ�������";						//�����ģ������ַ�������
		System.out.println('\n' + "����һ������str1��" + str1);
		System.out.println("������������str2��" + str2);
		System.out.println("������������str3��" + str3);
		System.out.println("�����Ĵ�����str4��" + str4);
		
		/*	�����ַ��������ã����ַ����������⣩	*/
		String longStr = "��װ����һ���ܳ�" +
		"�ܳ��ܳ����ַ���";
		System.out.println('\n' + "���ַ���longStr��" + longStr);
		
		/*	��ȡָ������λ�õ��ַ�	*/
		System.out.println('\n' + "str�ĵ������ַ��ǣ�" + str.charAt(2));
	}

}
