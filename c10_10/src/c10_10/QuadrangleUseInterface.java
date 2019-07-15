package c10_10;

interface drawTest {		//定义接口
	public void draw();		//定义方法
}

//定义平行四边形类，该类继承了四边形类，并实现了drawTest接口
class ParallelogramgleUseInterface extends QuadrangleUseInterface
implements drawTest {

	@Override
	public void draw() {		//由于该类实现了接口，所以需要覆盖draw()方法
		// TODO 自动生成的方法存根
		
		System.out.println("平行四边形.draw()");
	}
	
	void doAnyThing() {			//覆盖父类方法
		//SomeSentence
	}
	
}

class SquareUseInterface extends QuadrangleUseInterface
implements drawTest {
	
	@Override
	public void draw() {		//由于该类实现了接口，所以需要覆盖draw()方法
		// TODO 自动生成的方法存根
		
		System.out.println("正方形.draw()");
	}
	
	void doAnyThing() {			//覆盖父类方法
		//SomeSentence
	}
	
}

class AnyThingUseInterface extends QuadrangleUseInterface {
	void doAnyThing() {
		//SomeSentence
	}
}

public class QuadrangleUseInterface {		//定义四边形类
	void doAnyThing() {
		//SomeSentence
	}
	
	public static void main(String[] args) {
		drawTest[] d = {		//接口也可以进行向上转型操作
				new SquareUseInterface(), new ParallelogramgleUseInterface()
		};
		for(int i = 0; i < d.length; i++) {
			d[i].draw(); 		//调用draw()方法
		}
	}

}
