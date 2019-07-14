
public class c3_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12F;
		char mychar = 10;
		double mydouble = 45.46546D;

		/*	将运算结果输出	*/
		System.out.println("byte型与float型数据进行运算结果为：" + (mybyte + myfloat));
		System.out.println("byte型与int型数据进行运算结果为：" + (mybyte * myint));
		System.out.println("byte型与char型数据进行运算结果为：" + (mybyte / mychar));
		System.out.println("double型与char型数据进行运算结果为：" + (mydouble + mychar));	
		
		/*	精度损失	*/
		float pi = (float)3.1415926;
		System.out.println("pi:" + pi);
		int i = (int)pi;
		System.out.println("i:" + i);
		
		/*	数值越界溢出	*/
		byte b = (byte)129;
		System.out.println("b:" + b);
	}
}
