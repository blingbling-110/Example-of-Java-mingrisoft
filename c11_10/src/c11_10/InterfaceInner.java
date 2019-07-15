package c11_10;

interface OutInterface {		//定义一个接口
	
}


public class InterfaceInner {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		OuterClass out = new OuterClass();		//实例化一个OuterClass对象
		//调用doit()方法，返回一个OutInterface接口
		OutInterface outinter = out.doit("Let's go");
	}

}

class OuterClass {
	public OutInterface doit(final String x) {		//doit()方法参数为final类型
		//在doit()方法中定义一个内部类
		class InnerClass implements OutInterface {
			InnerClass(String s) {			//内部类构造方法
				s = x;
				System.out.println(s);
			}
		}
		return new InnerClass("doit");
	}
}