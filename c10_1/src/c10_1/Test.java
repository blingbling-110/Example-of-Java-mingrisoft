package c10_1;

class Test {

	public Test() {		//构造方法
		System.out.println("Test类构造方法");
	}
	
	protected void doSth() {		//成员方法
		System.out.println("Test类成员方法doSth");
	}
	
	protected Test doIt() {		//方法返回值类型为Test类型
		System.out.println("Test类成员方法doIt");
		return new Test();
	}
}

class Test2 extends Test {		//继承父类
	
	public Test2() {			//构造方法
		super();				//调用父类构造方法
		super.doSth();			//调用父类成员方法		
	}
	
	public void doSthNew() {	//新增方法
		System.out.println("Test2类新增方法doSthNew");
	}
	
	public void doSth() {		//重写父类方法
		System.out.println("重写doSth方法");
	}
	
	protected Test2 doIt() {	//重写父类方法，方法返回值类型为Test2类型
		System.out.println("重写doIt方法");
		return new Test2();
	}
}
