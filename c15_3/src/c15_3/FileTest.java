package c15_3;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "C:/Users/qinzijun/Desktop/FileTest.txt";
		File file = new File(filePath);
		
		try {
			//����FileOutputStream�����
			FileOutputStream out = new FileOutputStream(file);
			//����byte������
			byte[] outContent = "����һֻСë¿���Ҵ���Ҳ���".getBytes();
			out.write(outContent);
			out.close();		//�ر���
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		try {
			//����FileInputStream�����
			FileInputStream in = new FileInputStream(file);
			byte[] inContent = new byte[1024];		//����byte������
			int length = in.read(inContent);		//���ļ��ж�ȡ��Ϣ
			System.out.println("�ļ��е���Ϣ�ǣ�\n" + new String(inContent, 0, length));
			in.close();		//�ر���
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
