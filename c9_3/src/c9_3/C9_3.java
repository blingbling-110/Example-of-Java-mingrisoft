package c9_3;

public class C9_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		//取90°的正弦
		System.out.println("90度的正弦值：" + Math.sin(Math.PI / 2));
		//取0°的余弦
		System.out.println("0度的余弦值：" + Math.cos(0));
		//取60°的正切
		System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
		//取2的平方根与2商的反正弦
		System.out.println("2的平方根与2商的反正弦值："
				+ Math.asin(Math.sqrt(2) / 2));
		//取2的平方根与2商的反余弦
		System.out.println("2的平方根与2商的反余弦值："
				+ Math.acos(Math.sqrt(2) / 2));
		//取1的反正切
		System.out.println("1的反正切值：" + Math.atan(1));
		//取120°的弧度值
		System.out.println("120度的弧度值：" + Math.toRadians(120));
		//取π/2的角度
		System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));
	}

}
