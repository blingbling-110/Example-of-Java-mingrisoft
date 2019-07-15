package c15_6;

import java.io.*;

public class Example_01 {

	public static void main(String[] args) {
		String filePath = "C:/Users/qinzijun/Desktop/test.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			//创建DataOutputStream对象
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("使用writeUTF()方法写入数据；");
			dos.writeChars("使用writeChars()方法写入数据；");
			dos.writeBytes("使用writeBytes()方法写入数据。");
			dos.close();
			FileInputStream fis = new FileInputStream(filePath);
			//创建DataInputStream对象
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
