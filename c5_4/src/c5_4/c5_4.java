package c5_4;
/**
 * 用于练习正则表达式的类
 * @author Administrator
 *
 */
public class c5_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*判断指定的变量是否是合法的E-mail地址*/
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String emaddr = "523497359@qq.com";
		String emaddr1 = "523497359@qq.vip.com";
		String emaddr2 = "5234|97359@qq.com";
		System.out.println("emaddr的判定结果：" + emaddr.matches(regex));
		System.out.println("emaddr1的判定结果：" + emaddr1.matches(regex));
		System.out.println("emaddr2的判定结果：" + emaddr2.matches(regex));
		
		/*	判断指定的变量是否为大陆手机号	*/
		String regex1 = "(13\\d|15[^4]|18[^1234])\\d{8}";		/*	大陆手机号前三位：130、
		131、132、133、134、135、136、137、138、139、150、151、152、153、155、156、157、158、
		159、180、185、186、187、188、189	*/
		String phnum = "98765432109";
		String phnum1 = "15345678901";
		String phnum2 = "18265432109";
		System.out.println("\nphnum的判定结果：" + phnum.matches(regex1));
		System.out.println("phnum1的判定结果：" + phnum1.matches(regex1));
		System.out.println("phnum2的判定结果：" + phnum2.matches(regex1));
	}

}
