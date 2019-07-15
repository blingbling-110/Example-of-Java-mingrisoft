package c16_3;

import java.lang.reflect.Method;

public class Main_03 {

	public static void main(String[] args) {
		Example_03 example = new Example_03();
		Class<? extends Example_03> exampleC = example.getClass();
		Method[] declaredMethods = exampleC.getDeclaredMethods();
		for(Method m: declaredMethods) {
			System.out.println("����Ϊ��" + m.getName());		//��÷�������
			System.out.println("�Ƿ�������пɱ������Ĳ�����" + m.isVarArgs());
			System.out.println("��ڲ�����������Ϊ��");
			Class[] parameterTypes = m.getParameterTypes();
			for(Class c: parameterTypes) {
				System.out.println(" " + c);
			}
			//��÷�������ֵ����
			System.out.println("����ֵ����Ϊ��" + m.getReturnType());
			System.out.println("�����׳����쳣�����У�");
			//��÷��������׳��������쳣����
			Class[] exceptionTypes = m.getExceptionTypes();
			for(Class c: exceptionTypes) {
				System.out.println(" " + c);
			}
			boolean isTurn = true;
			while(isTurn) {
				//����÷����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
				try {
					isTurn = false;
					if(m.getName().equals("staticMethod")) {
						m.invoke(example);		//ִ��û����ڲ����ķ���
					}else if(m.getName().equals("publicMethod")) {
						m.invoke(example, 168);
					}else if(m.getName().equals("protectedMethod")) {
						m.invoke(example, "7", 5);
					}else if(m.getName().equals("privateMethod")) {
						Object[] parameters = new Object[] {
								new String[] {"M", "W", "Q"}
						};
						m.invoke(example, parameters);
					}
				}catch(Exception e) {
					System.out.println("��ִ�з���ʱ�׳��쳣��" 
				+ "����ִ��setAccessible()������");
					m.setAccessible(true);		//����Ϊ�������
					isTurn = true;
				}
			}
			System.out.println();
		}
	}

}
