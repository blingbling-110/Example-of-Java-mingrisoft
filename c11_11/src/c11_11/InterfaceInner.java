package c11_11;

interface OutInterface {		//����һ���ӿ�
	public int getValue();
}

public class InterfaceInner {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		OuterClass out = new OuterClass();		//ʵ����һ��OuterClass����
		//����doit()����������һ��OutInterface�ӿ�
		OutInterface outinter = out.doit();
		System.out.println(outinter.getValue());
	}

}

class OuterClass {
	public OutInterface doit() {		//����doit()����
		return new OutInterface() {		//���������ڲ���
			private int i = 520;
			public int getValue() {
				return i;
			}
		};
	}
}