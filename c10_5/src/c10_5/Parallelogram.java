package c10_5;

class Quadrangle {									//四边形类
	public static void draw(Quadrangle q) {			//四边形类中的方法
		System.out.println("调用四边形类draw()静态方法");
	}
}

public class Parallelogram extends Quadrangle{		//平行四边形类，继承了四边形类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Parallelogram p = new Parallelogram();		//实例化平行四边形类对象引用
		draw(p);									//调用父类方法
	}

}
