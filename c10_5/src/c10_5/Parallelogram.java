package c10_5;

class Quadrangle {									//�ı�����
	public static void draw(Quadrangle q) {			//�ı������еķ���
		System.out.println("�����ı�����draw()��̬����");
	}
}

public class Parallelogram extends Quadrangle{		//ƽ���ı����࣬�̳����ı�����

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		Parallelogram p = new Parallelogram();		//ʵ����ƽ���ı������������
		draw(p);									//���ø��෽��
	}

}
