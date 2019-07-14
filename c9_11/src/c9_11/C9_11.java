package c9_11;

import java.math.BigDecimal;

public class C9_11 {

	static final int location = 10;

	/**
	 * 定义加法方法，参数为加数与被加数
	 * 
	 * @param v1 相加的第一个数
	 * @param v2 相加的第二个数
	 * @return 两数之和
	 */
	public BigDecimal add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2);
	}

	/**
	 * 定义减法方法，参数为减数与被减数
	 * 
	 * @param v1 被减数
	 * @param v2 减数
	 * @return 两数之差
	 */
	public BigDecimal sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2);
	}
	
	/**
	 * 定义乘法方法，参数为乘数与被乘数
	 * 
	 * @param v1 第一个乘数
	 * @param v2 第二个乘数
	 * @return 两数之积
	 */
	public BigDecimal mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2);
	}

	/**
	 * 定义除法方法，参数为除数与被除数
	 * 
	 * @param v1 被除数
	 * @param v2 除数
	 * @return 两数之商
	 */
	public BigDecimal div(double v1, double v2) {
		return div(v1, v2, location);
	}
	public BigDecimal div(double v1, double v2, int scale) {
		if(scale < 0) {
			System.out.println("l值必须大于等于0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		//调用除法方法，商小数点后保留scale位，并将结果进行四舍五入操作
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		C9_11 b = new C9_11();
		System.out.println("两个数字相加结果：" + b.add(-7.5, 8.9));
		System.out.println("两个数字相减结果：" + b.sub(-7.5, 8.9));
		System.out.println("两个数字相乘结果：" + b.mul(-7.5, 8.9));
		System.out.println("两个数字相除结果，结果小数后保留10位：" + b.div(10, 2));
		System.out.println("两个数字相除，保留小数后5位：" + b.div(-7.5, 8.9, 5));
	}

}
