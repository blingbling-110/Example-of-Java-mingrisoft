package c5_5;

public class C5_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringBuffer sbf = new StringBuffer("古诗春晓");
		sbf.delete(0, 2);
		sbf.insert(1, "眠不觉");
		sbf.append("，处处闻啼鸟");
		System.out.println(sbf);
		
		/*	验证字符串操作和字符串生成器操作的效率	*/
		String str = "";
		long starTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			str += i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("\nString:" + time);
		StringBuilder sbd = new StringBuilder("");
		starTime = System.currentTimeMillis();
		for(int j = 0; j < 10000; j++) {
			sbd.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuilder:" + time);
	}

}
