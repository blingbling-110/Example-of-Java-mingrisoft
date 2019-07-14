package c16_2;

import java.lang.reflect.Field;

public class Main_02 {
	public static void main(String[] args) {
		Example_02 example = new Example_02();
		Class<? extends Example_02> exampleC = example.getClass();
		//获得所有成员变量
		Field[] declaredFields = exampleC.getDeclaredFields();
		for(Field d: declaredFields) {
			//获得成员变量名称
			System.out.println("名称为：" + d.getName());
			Class fieldType = d.getType();		//获得成员变量类型
			System.out.println("类型为：" + fieldType);
			boolean isTurn = true;
			while(isTurn) {
				//如果该成员变量的访问权限为private，则抛出异常，即不允许访问
				try {
					isTurn = false;
					//获得成员变量值
					System.out.println("修改前的值为：" + d.get(example));
					//判断成员变量的类型是否为int型
					if(fieldType.equals(int.class)) {
						System.out.println("利用方法setInt()修改成员变量的值");
						d.setInt(example, 168);		//为int型成员变量赋值
						//判断成员变量的类型是否为float型
					}else if(fieldType.equals(float.class)) {
						System.out.println("利用方法setFloat()修改成员变量的值");
						d.setFloat(example, 99.9F);
						//判断成员变量的类型是否为boolean型
					}else if(fieldType.equals(boolean.class)) {
						System.out.println("利用方法setBoolean()修改成员变量的值");
						d.setBoolean(example, true);
					}else {
						System.out.println("利用方法set()修改成员变量的值");
						//可以为各种类型的成员变量赋值
						d.set(example, "MWQ");
					}
					//获得成员变量值
					System.out.println("修改后的值为：" + d.get(example));
				}catch (Exception e) {
					System.out.println("在设置成员变量值时抛出异常，"
							 + "下面执行setAccessible()方法！");
					d.setAccessible(true);		//设置为允许访问
					isTurn = true;
				}
			}
			System.out.println();
		}
	}
}
