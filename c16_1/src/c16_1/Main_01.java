package c16_1;

import java.lang.reflect.*;

public class Main_01 {

	public static void main(String[] args) {
		Example_01 example = new Example_01("10", "20", "30");
		Class<? extends Example_01> exampleC = example.getClass();
		//������й��췽��
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
		for(int i = 0; i < declaredConstructors.length; i++) {
			Constructor<?> constructor = declaredConstructors[i];
			System.out.println("�鿴�Ƿ�������пɱ������Ĳ�����" + constructor.isVarArgs());
			System.out.println("�ù��췽������ڲ�����������Ϊ��");
			Class[] parameterTypes = constructor.getParameterTypes();		//��ȡ���в�������
			for(Class p: parameterTypes) {
				System.out.println(" " + p);
			}
			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
			//��ȡ���п����׳����쳣��Ϣ����
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(Class e: exceptionTypes) {
				System.out.println(" " + e);
			}
			Example_01 example2 = null;
			while(example2 == null) {
				//����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
				try {
					if(i == 2)
						//ͨ��ִ��Ĭ��û�в����Ĺ��췽����������
						example2 = (Example_01) constructor.newInstance();
					else if(i == 1)
						//ͨ��ִ�о������������Ĺ��췽����������
						example2 = (Example_01) constructor.newInstance("7", 5);
					else {
						//ͨ��ִ�о��пɱ����������Ĺ��췽����������
						Object[] parameters = new Object[] {
								new String[] {"100", "200", "300"}};
						example2 = (Example_01) constructor.newInstance(parameters);
					}
				}catch (Exception e) {
					System.out.println("�ڴ�������ʱ�׳��쳣������ִ��setAccessible()����");
					constructor.setAccessible(true);		//����Ϊ�������
				}
			}
			if(example2 != null) {
				example2.print();
				System.out.println();
			}
		}
	}

}
