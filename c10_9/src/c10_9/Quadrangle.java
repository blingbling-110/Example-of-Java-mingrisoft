package c10_9;

public class Quadrangle {

	//ʵ���������ı��ζ�����������
	private Quadrangle[] qtest = new Quadrangle[6];
	private int nextIndex = 0;
	public void draw(Quadrangle q) {		//����draw()����������Ϊ�ı��ζ���
		if(nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//ʵ���������ı��ζ������ڵ���draw()����
		Quadrangle q = new Quadrangle();
		q.draw(new Square());				//�������ζ���Ϊ��������draw()����
		q.draw(new Parallelogramgle());		//��ƽ���ı��ζ���Ϊ��������draw()����
	}

}

//����һ���������࣬�̳��ı�����
class Square extends Quadrangle {
	public Square() {
		System.out.println("������");
	}
}

//����һ��ƽ���ı����࣬�̳��ı�����
class Parallelogramgle extends Quadrangle {
	public Parallelogramgle() {
		System.out.println("ƽ���ı���");
	}
}