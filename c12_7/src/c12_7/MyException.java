package c12_7;

public class MyException extends Exception {		//创建自定义异常类
	String message;
	public MyException(String ErrorMessagr) {		//构造方法
		message = ErrorMessagr;
	}
	public String getMessage() {					//覆盖getMessage()方法
		return message;
	}
}
