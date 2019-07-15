package c11_13;

class ClassA {
	class ClassB {
		
	}
}

public class OutputInnerClass extends ClassA.ClassB {		//¼Ì³ĞÄÚ²¿ÀàClassB	
	public OutputInnerClass(ClassA a) {
		a.super();
	}
}
