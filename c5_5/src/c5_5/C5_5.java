package c5_5;

public class C5_5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StringBuffer sbf = new StringBuffer("��ʫ����");
		sbf.delete(0, 2);
		sbf.insert(1, "�߲���");
		sbf.append("������������");
		System.out.println(sbf);
		
		/*	��֤�ַ����������ַ���������������Ч��	*/
		String str = "";
		long starTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			str += i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("\nString:" + time);
		StringBuilder sbd = new StringBuilder("");
		starTime = System.currentTimeMillis();
		for(int j = 0; j < 10000; j++) {
			sbd.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuilder:" + time);
	}

}
