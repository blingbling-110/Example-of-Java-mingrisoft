package c8_1;

public class C8_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		String str[]= {"89", "12", "10", "18", "35"};
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println("�����еĸ�Ԫ��֮���ǣ�" + sum);
	}

}
