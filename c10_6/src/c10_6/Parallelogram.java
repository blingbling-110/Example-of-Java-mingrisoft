package c10_6;

class Quadrangle {
	public static void draw(Quadrangle q) {
		System.out.println("�����ı������draw()��̬����");
	}
}

public class Parallelogram extends Quadrangle {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		draw(new Parallelogram());
		//��ƽ���ı�������������ı��ζ��󣬳�Ϊ����ת�Ͳ���
		Quadrangle q = new Parallelogram();
		//Parallelogram p = q;
		//����������������������д���Ǵ����
		//�����������������󣬲�ǿ��ת��Ϊ�����ͣ�����д������ȷ��
		Parallelogram p = (Parallelogram)q;
	}

}
