package c5_4;
/**
 * ������ϰ������ʽ����
 * @author Administrator
 *
 */
public class c5_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		/*�ж�ָ���ı����Ƿ��ǺϷ���E-mail��ַ*/
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String emaddr = "523497359@qq.com";
		String emaddr1 = "523497359@qq.vip.com";
		String emaddr2 = "5234|97359@qq.com";
		System.out.println("emaddr���ж������" + emaddr.matches(regex));
		System.out.println("emaddr1���ж������" + emaddr1.matches(regex));
		System.out.println("emaddr2���ж������" + emaddr2.matches(regex));
		
		/*	�ж�ָ���ı����Ƿ�Ϊ��½�ֻ���	*/
		String regex1 = "(13\\d|15[^4]|18[^1234])\\d{8}";		/*	��½�ֻ���ǰ��λ��130��
		131��132��133��134��135��136��137��138��139��150��151��152��153��155��156��157��158��
		159��180��185��186��187��188��189	*/
		String phnum = "98765432109";
		String phnum1 = "15345678901";
		String phnum2 = "18265432109";
		System.out.println("\nphnum���ж������" + phnum.matches(regex1));
		System.out.println("phnum1���ж������" + phnum1.matches(regex1));
		System.out.println("phnum2���ж������" + phnum2.matches(regex1));
	}

}
