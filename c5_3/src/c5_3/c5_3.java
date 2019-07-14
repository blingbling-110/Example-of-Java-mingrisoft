package c5_3;

import java.util.Date;

/**
 * 格式化字符串练习
 * @author Administrator
 *
 */
public class c5_3 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		/*	日期格式化转换符	*/
		System.out.println("%te 一个月中的某一天（1~31）:\t" + String.format("%te", date));
		System.out.println("%tb 指定语言环境的月份简称:\t" + String.format("%tb", date));
		System.out.println("%tB 指定语言环境的月份全称:\t" + String.format("%tB", date));
		System.out.println("%tA 指定语言环境的星期几全称:\t" + String.format("%tA", date));
		System.out.println("%ta 指定语言环境的星期几简称:\t" + String.format("%ta", date));
		System.out.println("%tc 包括全部日期和时间信息:\t" + String.format("%tc", date));
		System.out.println("%tY 4位年份:\t" + String.format("%tY", date));
		System.out.println("%tj 一年中的第几天（001~366）:\t" + String.format("%tj", date));
		System.out.println("%tm 月份:\t" + String.format("%tm", date));
		System.out.println("%td 一个月中的第几天（01~31）:\t" + String.format("%td", date));
		System.out.println("%ty 2位年份:\t" + String.format("%ty", date));
		
		/*	时间格式化转换符	*/
		System.out.println("\n%tH 2位数字的24时制的小时（00~23）:\t" + String.format("%tH", date));
		System.out.println("%tI 2位数字的12时制的小时（01~12）:\t" + String.format("%tI", date));
		System.out.println("%tk 2位数字的24时制的小时（0~23）:\t" + String.format("%tk", date));
		System.out.println("%tl 2位数字的12时制的小时（1~12）:\t" + String.format("%tl", date));
		System.out.println("%tM 2位数字的分钟（00~59）:\t" + String.format("%tM", date));
		System.out.println("%tS 2位数字的秒数（00~60）:\t" + String.format("%tS", date));
		System.out.println("%tL 3位数字的毫秒数（000~999）:\t" + String.format("%tL", date));
		System.out.println("%tN 9位数字的微秒数（000000000~999999999）:\t" + String.format("%tN", date));
		System.out.println("%tp 指定语言环境下上午或下午标记:\t" + String.format("%tp", date));
		System.out.println("%tz 相对于GMT RFC 82格式的数字时区偏移量:\t" + String.format("%tz", date));
		System.out.println("%tZ 时区缩写形式的字符串:\t" + String.format("%tZ", date));
		System.out.println("%ts 1970-01-01 00:00:00至现在经过的秒数:\t" + String.format("%ts", date));
		System.out.println("%tQ 1970-01-01 00:00:00至现在经过的毫秒数:\t" + String.format("%tQ", date));
		
		/*	日期和时间组合的格式	*/
		System.out.println("\n%tF “年-月-日”格式（4位年份）:\t" + String.format("%tF", date));
		System.out.println("%tD “月/日/年”格式（2位年份）:\t" + String.format("%tD", date));
		System.out.println("%tc 全部日期和时间信息:\t" + String.format("%tc", date));
		System.out.println("%tr “时:分:秒 PM(AM)”格式（12时制）:\t" + String.format("%tr", date));
		System.out.println("%tT “时:分:秒”格式（24时制）:\t" + String.format("%tT", date));
		System.out.println("%tR “时:分”格式（24时制）:\t" + String.format("%tR", date));
		
		/*	常规转换符	*/
		System.out.println("\n%b、%B 结果被格式化为布尔类型：\t" + String.format("%b", 1 > 2));
		System.out.println("%h、%H 结果被格式化为散列码：\t" + String.format("%h", 1 > 2));
		System.out.println("%s、%S 结果被格式化为字符串类型：\t" + String.format("%s", 012));
		System.out.println("%c、%C 结果被格式化为字符类型：\t" + String.format("%c", 'q'));
		System.out.println("%d 结果被格式化为十进制整数：\t" + String.format("%d", 012));
		System.out.println("%o 结果被格式化为八进制整数：\t" + String.format("%o", 211));
		System.out.println("%x、%X 结果被格式化为十六进制整数：\t" + String.format("%x", 985));
		System.out.println("%e 结果被格式化为用计算机科学计数法表示的十进制数：\t" + String.format("%.2e", 1995.0110F));
		System.out.println("%a 结果被格式化为带有效位数和指数的十六进制浮点值：\t" + String.format("%a", 1995.0110F));
		System.out.println("%n 结果为特定于平台的行分隔符：\t[" + String.format("%n") + ']');
		System.out.println("%% 结果为字面值'%'：\t" + String.format("%%"));
	}
}
