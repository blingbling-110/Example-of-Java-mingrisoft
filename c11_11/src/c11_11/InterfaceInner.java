package c11_11;

interface OutInterface {		//定义一个接口
	public int getValue();
}

public class InterfaceInner {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		OuterClass out = new OuterClass();		//实例化一个OuterClass对象
		//调用doit()方法，返回一个OutInterface接口
		OutInterface outinter = out.doit();
		System.out.println(outinter.getValue());
	}

}

class OuterClass {
	public OutInterface doit() {		//定义doit()方法
		return new OutInterface() {		//声明匿名内部类
			private int i = 520;
			public int getValue() {
				return i;
			}
		};
	}
}