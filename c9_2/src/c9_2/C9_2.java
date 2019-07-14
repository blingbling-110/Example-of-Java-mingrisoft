package c9_2;

import java.text.DecimalFormat;

public class C9_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(2);		//设置将数字分组为2
		String output = myFormat.format(123456.789);
		System.out.println("将数字以每两个数字分组" + output);
		myFormat.setGroupingUsed(false);		//设置不允许数字进行分组
		String output2 = myFormat.format(123456.789);
		System.out.println("不允许数字分组" + output2);
	}

}
