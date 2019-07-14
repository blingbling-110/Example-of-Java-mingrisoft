
public class c4_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a, b, c;
		for(a = 1; a <= 100 / 5; a++) {
			for(b = 1; b <= 100 / 3; b++) {
				for(c = 3; c <= 100 / 1 * 3; c += 3) {
					if((a + b + c == 100) && (a * 5 + b * 3 + c * 1 / 3 == 100)) {
						System.out.println("翁：" + a + "只；母：" + b + "只；雏：" + c + "只。");
					}
				}
			}
		}
	}

}
