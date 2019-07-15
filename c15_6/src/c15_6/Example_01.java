package c15_6;

import java.io.*;

public class Example_01 {

	public static void main(String[] args) {
		String filePath = "C:/Users/qinzijun/Desktop/test.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			//����DataOutputStream����
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("ʹ��writeUTF()����д�����ݣ�");
			dos.writeChars("ʹ��writeChars()����д�����ݣ�");
			dos.writeBytes("ʹ��writeBytes()����д�����ݡ�");
			dos.close();
			FileInputStream fis = new FileInputStream(filePath);
			//����DataInputStream����
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
