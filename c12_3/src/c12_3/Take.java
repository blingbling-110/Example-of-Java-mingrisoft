package c12_3;

public class Take {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {										//try语句中包含可能出现异常的程序代码
			String str = "lili";
			System.out.println(str + "年龄是：");
			int age = Integer.parseInt("20L");
			System.out.println(age);
		} catch(Exception e) {						//catch语句块用来获取异常信息
			e.printStackTrace();					//输出异常性质
		}
		System.out.println("program over");
	}

}
