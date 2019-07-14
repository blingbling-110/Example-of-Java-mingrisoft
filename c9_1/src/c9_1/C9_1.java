package c9_1;

import java.text.DecimalFormat;

public class C9_1 {

	//使用实例化对象时设置格式化模式
	static public void SimpleFormat(String pattern, double value) {
		//实例化DecimalFormat对象
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);		//将数字进行格式化
		System.out.println(value + " " + pattern + " " + output);
	}
	
	//使用applyPattern()方法对数字进行格式化
	static public void UseApplyPattern(String pattern, double value) {
		//实例化DecimalFormat对象
		DecimalFormat myFormat = new DecimalFormat();
		//调用applyPattern()方法设置格式化模板
		myFormat.applyPattern(pattern);
		System.out.println(value + " " + pattern
				+ " " + myFormat.format(value));
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		SimpleFormat("###,###.###", 123456.789);		//调用静态SimpleFormat()方法
		SimpleFormat("00000000.###kg", 123456.789);		//在数字后加上单位
		//按照格式模板格式化数字，不存在的位以0显示
		SimpleFormat("000000.000", 123.78);
		//调用静态UseApplyPattern()方法
		UseApplyPattern("#.###%", 0.789);				//将数字转换为百分数形式
		//将小数点后格式化为两位
		UseApplyPattern("###.##", 123456.789);
		//将数字转化为千分数形式
		UseApplyPattern("0.00\u2030", 0.789);
	}

}
