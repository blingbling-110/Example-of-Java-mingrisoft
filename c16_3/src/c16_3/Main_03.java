package c16_3;

import java.lang.reflect.Method;

public class Main_03 {

	public static void main(String[] args) {
		Example_03 example = new Example_03();
		Class exampleC = example.getClass();
		//������з���
		Method[] declaredMethods = exampleC.getDeclaredMethods();
		for(Method m: declaredMethods) {
			System.out.println("����Ϊ��" + m.getName());		//��÷�������
			
		}
	}

}
