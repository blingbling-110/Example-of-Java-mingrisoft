package c12_7;

public class Captor {
	static int quotient(int x, int y) throws MyException {		//���巽���׳��쳣
		if(y < 0) {
			throw new MyException("���������Ǹ���");				//�쳣��Ϣ
		}
		return x / y;
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {													//try���������ܷ����쳣�����
			int result = quotient(3, -1);
		} catch(MyException e) {								//�����Զ����쳣
			System.out.println(e.getMessage());
		} catch(ArithmeticException e) {						//����ArithmeticException�쳣
			System.out.println("��������Ϊ0");
		} catch(Exception e) {									//���������쳣
			System.out.println("���������������쳣");
		}
	}

}
