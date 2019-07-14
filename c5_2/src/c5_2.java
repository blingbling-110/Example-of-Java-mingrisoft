/**
 * 这是用来练习字符串常用操作的类
 * @author blingbling
 *
 */
public class c5_2 {
	/**
	 * 这是类的主方法
	 * @param args 这是主方法的参数
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*	获取子字符串	*/
		String str0 = "获取子字符串";
		System.out.println("获取子字符串结果1：" + str0.substring(2));
		System.out.println("获取子字符串结果2：" + str0.substring(2, 5));
		
		/*	去除空格	*/
		String str1 = "		" + str0 + "  ";
		System.out.println("\n原字符串：[" + str1 + "]\n去除空格后结果：[" + str1.trim() + ']');
		
		/*	字符串替换	*/
		String str2 = "SHOW me THE money";
		System.out.println("\n字符串替换结果1：" + str2.replace("SHOW", "show"));
		System.out.println("字符串替换结果2：" + str2.replace('e', 'E'));
		System.out.println("字符串替换结果3：" + str2.replaceFirst("e", "E"));
		System.out.println("字符串替换结果4：" + str2.replaceAll("\\s", "\t"));
		
		/*	判断字符串的开始与结尾	*/
		System.out.println("\n判断字符串的开始1：" + str2.startsWith("SH"));
		System.out.println("判断字符串的开始2：" + str2.startsWith("sh"));
		System.out.println("判断字符串的开始3：" + str2.startsWith("THE", 8));
		System.out.println("判断字符串的结尾：" + str2.endsWith("ey"));
		
		/*	判断字符串是否相等	*/
		String str3 = new String("SHOW me THE money");
		String str4 = "SHOW me THE money";
		String str5 = "show me the money";
		System.out.println("\n判断字符串是否相等1：" + (str2 == str3));
		System.out.println("判断字符串是否相等2：" + (str2.equals(str3)));
		System.out.println("判断字符串是否相等3：" + (str2 == str4));
		System.out.println("判断字符串是否相等4：" + (str2.equals(str5)));
		System.out.println("判断字符串是否相等5：" + (str2.equalsIgnoreCase(str5)));
		
		/*	按字典顺序比较两个字符串	*/
		String str6 = "abc";
		String str7 = "Abc";
		String str8 = "aBc";
		String str9 = "cba";
		System.out.println("\n按字典顺序比较两个字符串1：" + str6.compareTo(str7));
		System.out.println("按字典顺序比较两个字符串2：" + str6.compareTo(str8));
		System.out.println("按字典顺序比较两个字符串3：" + str6.compareTo(str9));
		System.out.println("按字典顺序比较两个字符串4：" + str6.compareToIgnoreCase(str7));
		
		/*	字母大小写转换	*/
		System.out.println("\n字母大写转换：" + str2.toUpperCase());
		System.out.println("字母小写转换：" + str2.toLowerCase());
		
		/*	字符串分割	*/
		System.out.println("\n字符串分割1：" + str2.split("\\s"));		//注意：字符串数组不能直接输出
		String[] array0 = str2.split("\\s");
		String[] array1 = str2.split("\\s", 3);		//注意：第二个参数int limit是分割次数+1
		System.out.print("字符串分割2：");
		for(String x: array0) {
			System.out.print('[' + x + ']');
		}
		System.out.print("\n字符串分割3：");
		for(String x: array1) {
			System.out.print('[' + x + ']');
		}
	}

}
