package c15_1;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "D:/wallpaper20180818.jpg";
		File file = new File(filePath);		//�����ļ�����
		if(file.exists()) {					//�ж��ļ��Ƿ����
			file.delete();					//ɾ���ļ�
			System.out.println("�ļ���ɾ��");
		}else {
			try {
				file.createNewFile();		//�������ļ�
				System.out.println("�ļ��Ѵ���");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
	}

}
