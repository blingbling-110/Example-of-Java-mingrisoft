import java.util.Scanner;

public class c4_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);		//����һ��ɨ����
		String pwd1 = "0";
		String pwd2 = "-1";
		
		do {
			System.out.println("���������룺");
			pwd1 = sc.nextLine();
			System.out.println("���ٴ��������룺");
			pwd2 = sc.nextLine();
			if(!pwd1.equals(pwd2)) {
				System.out.println("����������벻һ�£����������룡");
			}
		}
		while(!pwd1.equals(pwd2));
		System.out.println("��������ɹ���");
	}

}
