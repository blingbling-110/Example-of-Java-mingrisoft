package c10_2;

class Parent {		//����
	Parent(){
		System.out.println("���ø����Parent()���췽��");
	}
}

class SubParent extends Parent {		//�̳�Parent��
	SubParent(){
		System.out.println("���������SubParent()���췽��");
	}
}

public class Subroutine extends SubParent {		//�̳�SubParent��

	Subroutine(){
		System.out.println("���������Subroutine()���췽��");
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		Subroutine s = new Subroutine();		//ʵ�����������
	}

}
