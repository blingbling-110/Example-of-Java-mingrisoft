package c11_8;

interface OutInterface {		//����һ���ӿ�
	public void f();
}

public class InterfaceInner {

	public static void main(String[] args) {
		OuterClass out = new OuterClass();		//ʵ����һ��OuterClass����
		//����doit()����������һ��OutInterface�ӿ�
		OutInterface outinter = out.doit();
		outinter.f();							//����f()����
	}
}

class OuterClass {
	//����һ���ڲ���ʵ��OutInterface�ӿ�
	private class InnerClass implements OutInterface {

		InnerClass(String s) {			//�ڲ��๹�췽��
			System.out.println(s);
		}
		
		@Override
		public void f() {				//ʵ�ֽӿ��е�f()����
			// TODO �Զ����ɵķ������
			
			System.out.println("�����ڲ����е�f()����");
		}
		
	}
	
	public OutInterface doit() {		//����һ������������ֵ����ΪOutInterface�ӿ�
		return new InnerClass("�����ڲ��๹�췽��");
	}
}