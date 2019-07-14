import java.util.Scanner;

public class c4_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);		//创建一个扫描器
		String pwd1 = "0";
		String pwd2 = "-1";
		
		do {
			System.out.println("请输入密码：");
			pwd1 = sc.nextLine();
			System.out.println("请再次输入密码：");
			pwd2 = sc.nextLine();
			if(!pwd1.equals(pwd2)) {
				System.out.println("您输入的密码不一致，请重新输入！");
			}
		}
		while(!pwd1.equals(pwd2));
		System.out.println("设置密码成功！");
	}

}
