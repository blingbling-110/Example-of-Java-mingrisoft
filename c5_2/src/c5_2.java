/**
 * ����������ϰ�ַ������ò�������
 * @author blingbling
 *
 */
public class c5_2 {
	/**
	 * �������������
	 * @param args �����������Ĳ���
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		/*	��ȡ���ַ���	*/
		String str0 = "��ȡ���ַ���";
		System.out.println("��ȡ���ַ������1��" + str0.substring(2));
		System.out.println("��ȡ���ַ������2��" + str0.substring(2, 5));
		
		/*	ȥ���ո�	*/
		String str1 = "		" + str0 + "  ";
		System.out.println("\nԭ�ַ�����[" + str1 + "]\nȥ���ո������[" + str1.trim() + ']');
		
		/*	�ַ����滻	*/
		String str2 = "SHOW me THE money";
		System.out.println("\n�ַ����滻���1��" + str2.replace("SHOW", "show"));
		System.out.println("�ַ����滻���2��" + str2.replace('e', 'E'));
		System.out.println("�ַ����滻���3��" + str2.replaceFirst("e", "E"));
		System.out.println("�ַ����滻���4��" + str2.replaceAll("\\s", "\t"));
		
		/*	�ж��ַ����Ŀ�ʼ���β	*/
		System.out.println("\n�ж��ַ����Ŀ�ʼ1��" + str2.startsWith("SH"));
		System.out.println("�ж��ַ����Ŀ�ʼ2��" + str2.startsWith("sh"));
		System.out.println("�ж��ַ����Ŀ�ʼ3��" + str2.startsWith("THE", 8));
		System.out.println("�ж��ַ����Ľ�β��" + str2.endsWith("ey"));
		
		/*	�ж��ַ����Ƿ����	*/
		String str3 = new String("SHOW me THE money");
		String str4 = "SHOW me THE money";
		String str5 = "show me the money";
		System.out.println("\n�ж��ַ����Ƿ����1��" + (str2 == str3));
		System.out.println("�ж��ַ����Ƿ����2��" + (str2.equals(str3)));
		System.out.println("�ж��ַ����Ƿ����3��" + (str2 == str4));
		System.out.println("�ж��ַ����Ƿ����4��" + (str2.equals(str5)));
		System.out.println("�ж��ַ����Ƿ����5��" + (str2.equalsIgnoreCase(str5)));
		
		/*	���ֵ�˳��Ƚ������ַ���	*/
		String str6 = "abc";
		String str7 = "Abc";
		String str8 = "aBc";
		String str9 = "cba";
		System.out.println("\n���ֵ�˳��Ƚ������ַ���1��" + str6.compareTo(str7));
		System.out.println("���ֵ�˳��Ƚ������ַ���2��" + str6.compareTo(str8));
		System.out.println("���ֵ�˳��Ƚ������ַ���3��" + str6.compareTo(str9));
		System.out.println("���ֵ�˳��Ƚ������ַ���4��" + str6.compareToIgnoreCase(str7));
		
		/*	��ĸ��Сдת��	*/
		System.out.println("\n��ĸ��дת����" + str2.toUpperCase());
		System.out.println("��ĸСдת����" + str2.toLowerCase());
		
		/*	�ַ����ָ�	*/
		System.out.println("\n�ַ����ָ�1��" + str2.split("\\s"));		//ע�⣺�ַ������鲻��ֱ�����
		String[] array0 = str2.split("\\s");
		String[] array1 = str2.split("\\s", 3);		//ע�⣺�ڶ�������int limit�Ƿָ����+1
		System.out.print("�ַ����ָ�2��");
		for(String x: array0) {
			System.out.print('[' + x + ']');
		}
		System.out.print("\n�ַ����ָ�3��");
		for(String x: array1) {
			System.out.print('[' + x + ']');
		}
	}

}
