package c10_1;

class Test {

	public Test() {		//���췽��
		System.out.println("Test�๹�췽��");
	}
	
	protected void doSth() {		//��Ա����
		System.out.println("Test���Ա����doSth");
	}
	
	protected Test doIt() {		//��������ֵ����ΪTest����
		System.out.println("Test���Ա����doIt");
		return new Test();
	}
}

class Test2 extends Test {		//�̳и���
	
	public Test2() {			//���췽��
		super();				//���ø��๹�췽��
		super.doSth();			//���ø����Ա����		
	}
	
	public void doSthNew() {	//��������
		System.out.println("Test2����������doSthNew");
	}
	
	public void doSth() {		//��д���෽��
		System.out.println("��дdoSth����");
	}
	
	protected Test2 doIt() {	//��д���෽������������ֵ����ΪTest2����
		System.out.println("��дdoIt����");
		return new Test2();
	}
}
