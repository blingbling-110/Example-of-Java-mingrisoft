package c12_6;

public class Shoot {
	static void pop() throws NegativeArraySizeException {
		//定义方法并抛出NegativeArraySizeException异常
		int[] arr = new int[-3];						//创建数组
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {											//try语句处理异常信息
			pop();
		} catch (NegativeArraySizeException e) {
			System.out.println("pop()方法抛出的异常");		//输出异常信息
		}
	}

}
