package c10_3;

public class ObjectInstance {

	public String toString() {		//��дtoString()����
		return "��" + getClass().getName() + "������дtoString()����";
	}
		
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		System.out.println(new ObjectInstance());		//��ӡ�������
	}

}
