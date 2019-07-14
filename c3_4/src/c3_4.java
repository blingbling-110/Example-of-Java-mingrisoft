
public class c3_4 {
	
	/*成员变量*/
	static int age = 24;				//静态变量（也称类变量）
	final static float PI = 3.14F;		//声明常量PI，此时如不对PI进行赋值，则会出现错误提示
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		age = 25;
		//PI = 3.1415F;			//错误的代码，因为PI为常量，只能进行一次赋值
		final int number;		//局部变量
		number = 3;
		System.out.println("int型变量age的值为：" + age);
		System.out.println("常量PI的值为：" + PI);
		System.out.println("赋值后number的值为：" + number);
	}
	
}
