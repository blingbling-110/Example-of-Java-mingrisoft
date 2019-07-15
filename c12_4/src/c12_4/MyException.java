package c12_4;

public class MyException extends Exception{			//创建自定义异常，继承Exception类
	public MyException(String ErrorMessage) {		//构造方法
		super(ErrorMessage);						//父类构造方法
	}
}
