
public class c3_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char a = 'a', b = '#';		//����char�ͱ���
		int c = 23046, d = 45212;		//����int�ͱ���
		System.out.println("a��unicode���е�˳��λ���ǣ�" + (int)a);
		System.out.println("#��unicode���е�˳��λ���ǣ�" + (int)b);
		System.out.println("unicode���еĵ�23046λ�ǣ�" + (char)c);
		System.out.println("unicode���еĵ�45212λ�ǣ�" + (char)d);
		System.out.println('\102');
		System.out.println('\u2606');
		System.out.println("[\t]");
		System.out.println("[\r]");
		System.out.println("[\n]");
		System.out.println("[\b]");
		System.out.println("[\f]");
	}

}
