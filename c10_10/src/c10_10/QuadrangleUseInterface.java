package c10_10;

interface drawTest {		//����ӿ�
	public void draw();		//���巽��
}

//����ƽ���ı����࣬����̳����ı����࣬��ʵ����drawTest�ӿ�
class ParallelogramgleUseInterface extends QuadrangleUseInterface
implements drawTest {

	@Override
	public void draw() {		//���ڸ���ʵ���˽ӿڣ�������Ҫ����draw()����
		// TODO �Զ����ɵķ������
		
		System.out.println("ƽ���ı���.draw()");
	}
	
	void doAnyThing() {			//���Ǹ��෽��
		//SomeSentence
	}
	
}

class SquareUseInterface extends QuadrangleUseInterface
implements drawTest {
	
	@Override
	public void draw() {		//���ڸ���ʵ���˽ӿڣ�������Ҫ����draw()����
		// TODO �Զ����ɵķ������
		
		System.out.println("������.draw()");
	}
	
	void doAnyThing() {			//���Ǹ��෽��
		//SomeSentence
	}
	
}

class AnyThingUseInterface extends QuadrangleUseInterface {
	void doAnyThing() {
		//SomeSentence
	}
}

public class QuadrangleUseInterface {		//�����ı�����
	void doAnyThing() {
		//SomeSentence
	}
	
	public static void main(String[] args) {
		drawTest[] d = {		//�ӿ�Ҳ���Խ�������ת�Ͳ���
				new SquareUseInterface(), new ParallelogramgleUseInterface()
		};
		for(int i = 0; i < d.length; i++) {
			d[i].draw(); 		//����draw()����
		}
	}

}
