
public class c3_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char a = 'a', b = '#';		//定义char型变量
		int c = 23046, d = 45212;		//定义int型变量
		System.out.println("a在unicode表中的顺序位置是：" + (int)a);
		System.out.println("#在unicode表中的顺序位置是：" + (int)b);
		System.out.println("unicode表中的第23046位是：" + (char)c);
		System.out.println("unicode表中的第45212位是：" + (char)d);
		System.out.println('\102');
		System.out.println('\u2606');
		System.out.println("[\t]");
		System.out.println("[\r]");
		System.out.println("[\n]");
		System.out.println("[\b]");
		System.out.println("[\f]");
	}

}
