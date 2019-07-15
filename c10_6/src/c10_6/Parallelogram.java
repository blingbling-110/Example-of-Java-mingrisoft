package c10_6;

class Quadrangle {
	public static void draw(Quadrangle q) {
		System.out.println("调用四边形类的draw()静态方法");
	}
}

public class Parallelogram extends Quadrangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		draw(new Parallelogram());
		//将平行四边形类对象看做是四边形对象，称为向上转型操作
		Quadrangle q = new Parallelogram();
		//Parallelogram p = q;
		//将父类对象赋予子类对象，这种写法是错误的
		//将父类对象赋予子类对象，并强制转换为子类型，这种写法是正确的
		Parallelogram p = (Parallelogram)q;
	}

}
