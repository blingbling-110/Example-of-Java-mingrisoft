package c15_2;

import java.io.*;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "D:/wallpaper20180818.jpg";
		File file = new File(filePath);
		if(file.exists()) {									//�ж϶����Ƿ����
			String name = file.getName();					//��ȡ��������
			boolean readable = file.canRead();				//�����Ƿ�ɶ�
			boolean writeable = file.canWrite();			//�����Ƿ��д
			long length = file.length();					//��ȡ���󳤶ȣ���λ���ֽڣ�
			String absPath = file.getAbsolutePath();		//��ȡ�������·��
			String parPath = file.getParent();				//��ȡ����·��
			boolean isFile = file.isFile();					//�ж϶����Ƿ�Ϊ�ļ�
			boolean isDir = file.isDirectory();				//�ж϶����Ƿ�ΪĿ¼
			boolean isHidden = file.isHidden();				//�ж϶����Ƿ�Ϊ�����ļ�
			long modTime = file.lastModified();				//��ȡ��������޸�ʱ��
			System.out.println("�������ƣ�" + name);
			System.out.println("����ɶ���" + readable);
			System.out.println("�����д��" + writeable);
			System.out.println("���󳤶ȣ�" + length);
			System.out.println("�������·����" + absPath);
			System.out.println("����·����" + parPath);
			System.out.println("�����Ƿ�Ϊ�ļ���" + isFile);
			System.out.println("�����Ƿ�ΪĿ¼��" + isDir);
			System.out.println("�����Ƿ�Ϊ�����ļ���" + isHidden);
			System.out.println("��������޸�ʱ�䣺" +
			String.format("%tc", new Date(modTime)));
			file.delete();
		}else {
			System.out.println("�ö��󲻴���");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
