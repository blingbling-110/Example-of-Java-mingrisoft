package c12_7;

public class MyException extends Exception {		//�����Զ����쳣��
	String message;
	public MyException(String ErrorMessagr) {		//���췽��
		message = ErrorMessagr;
	}
	public String getMessage() {					//����getMessage()����
		return message;
	}
}
