package c7_1;

public class C7_1 {
	int i = 24;
	
	public void call() {
		System.out.println("����call������");
		for(i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		C7_1 o1 = new C7_1();
		C7_1 o2 = new C7_1();
		o2.i = 60;		//��ʵ������o2�ĳ�Ա����i��ֵΪ60
		//ʹ��ʵ������o1���ó�Ա����i
		System.out.println("ʵ������o1���ó�Ա����i�Ľ����" + o1.i++);
		o1.call();		//ʹ��ʵ������o1���ó�Ա����
		//ʹ��ʵ������o2���ó�Ա����i
		System.out.println("ʵ������o2���ó�Ա����i�Ľ����" + o2.i++);
		o2.call();		//ʹ��ʵ������o2���ó�Ա����
	}

}
