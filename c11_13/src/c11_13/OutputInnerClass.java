package c11_13;

class ClassA {
	class ClassB {
		
	}
}

public class OutputInnerClass extends ClassA.ClassB {		//�̳��ڲ���ClassB	
	public OutputInnerClass(ClassA a) {
		a.super();
	}
}
