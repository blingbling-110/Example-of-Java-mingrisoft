package c7_1;

public class C7_1 {
	int i = 24;
	
	public void call() {
		System.out.println("调用call方法：");
		for(i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		C7_1 o1 = new C7_1();
		C7_1 o2 = new C7_1();
		o2.i = 60;		//将实例对象o2的成员变量i赋值为60
		//使用实例对象o1调用成员变量i
		System.out.println("实例对象o1调用成员变量i的结果：" + o1.i++);
		o1.call();		//使用实例对象o1调用成员方法
		//使用实例对象o2调用成员变量i
		System.out.println("实例对象o2调用成员变量i的结果：" + o2.i++);
		o2.call();		//使用实例对象o2调用成员方法
	}

}
