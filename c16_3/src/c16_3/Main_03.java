package c16_3;

import java.lang.reflect.Method;

public class Main_03 {

	public static void main(String[] args) {
		Example_03 example = new Example_03();
		Class<? extends Example_03> exampleC = example.getClass();
		Method[] declaredMethods = exampleC.getDeclaredMethods();
		for(Method m: declaredMethods) {
			System.out.println("名称为：" + m.getName());		//获得方法名称
			System.out.println("是否允许带有可变数量的参数：" + m.isVarArgs());
			System.out.println("入口参数类型依次为：");
			Class[] parameterTypes = m.getParameterTypes();
			for(Class c: parameterTypes) {
				System.out.println(" " + c);
			}
			//获得方法返回值类型
			System.out.println("返回值类型为：" + m.getReturnType());
			System.out.println("可能抛出的异常类型有：");
			//获得方法可能抛出的所有异常类型
			Class[] exceptionTypes = m.getExceptionTypes();
			for(Class c: exceptionTypes) {
				System.out.println(" " + c);
			}
			boolean isTurn = true;
			while(isTurn) {
				//如果该方法的访问权限为private，则抛出异常，即不允许访问
				try {
					isTurn = false;
					if(m.getName().equals("staticMethod")) {
						m.invoke(example);		//执行没有入口参数的方法
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
					System.out.println("在执行方法时抛出异常，" 
				+ "下面执行setAccessible()方法！");
					m.setAccessible(true);		//设置为允许访问
					isTurn = true;
				}
			}
			System.out.println();
		}
	}

}
