
public class c5_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*	字符串中查找""的索引	*/
		String str = "字符串查找";
		System.out.println("str中\"\"的尾索引：" + str.lastIndexOf(""));
		System.out.println("str中\"\"的首索引：" + str.indexOf(""));
		System.out.println("str的长度：" + str.length());
		System.out.println("若查找不到则返回：" + str.indexOf("abc"));
		
		/*	创建字符串的几种方法	*/
		char arr[] = {'字', '符', '数', '组'};
		String str1 = new String(arr);				//方法一：String(char a[])
		String str2 = new String(arr, 1, 2);		//方法二：String(char a[], int offset, int length)
		String str3 = new String("字符数组");		//方法三：String(char[] value)
		String str4;								//声明字符串
		str4 = "引用字符串常量";						//方法四：引用字符串常量
		System.out.println('\n' + "方法一创建的str1：" + str1);
		System.out.println("方法二创建的str2：" + str2);
		System.out.println("方法三创建的str3：" + str3);
		System.out.println("方法四创建的str4：" + str4);
		
		/*	连接字符串的巧用（长字符串换行问题）	*/
		String longStr = "假装这是一个很长" +
		"很长很长的字符串";
		System.out.println('\n' + "长字符串longStr：" + longStr);
		
		/*	获取指定索引位置的字符	*/
		System.out.println('\n' + "str的第三个字符是：" + str.charAt(2));
	}

}
