package c11_10;

interface OutInterface {		//����һ���ӿ�
	
}


public class InterfaceInner {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		OuterClass out = new OuterClass();		//ʵ����һ��OuterClass����
		//����doit()����������һ��OutInterface�ӿ�
		OutInterface outinter = out.doit("Let's go");
	}

}

class OuterClass {
	public OutInterface doit(final String x) {		//doit()��������Ϊfinal����
		//��doit()�����ж���һ���ڲ���
		class InnerClass implements OutInterface {
			InnerClass(String s) {			//�ڲ��๹�췽��
				s = x;
				System.out.println(s);
			}
		}
		return new InnerClass("doit");
	}
}