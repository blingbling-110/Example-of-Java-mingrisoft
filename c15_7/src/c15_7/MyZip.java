package c15_7;

import java.io.*;
import java.util.zip.*;

public class MyZip {

	private void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(
				zipFileName));			//����ZipOutputStream����
		zip(zos, inputFile, "");
		System.out.println("ѹ���С���");
		zos.close();
	}
	
	private void zip(ZipOutputStream zos, File inputFile, String base
			) throws Exception {								//��������
		if(inputFile.isDirectory()) {
			File[] fl = inputFile.listFiles();					//��ȡ·������
			if(base.length() != 0) {
				zos.putNextEntry(new ZipEntry(base + "/"));		//д���Ŀ¼��entry
			}
			for(int i = 0; i < fl.length; i++) {				//ѭ�����������е��ļ�
				zip(zos, fl[i], base + fl[i]);
			}
		}else {
			zos.putNextEntry(new ZipEntry(base));				//�����µĽ����
			FileInputStream fis = new FileInputStream(inputFile);
			int b;												//����int�ͱ���
			System.out.println(base);
			while((b = fis.read()) != -1) {						//δ��������β��
				zos.write(b);									//���ֽ�д�뵱ǰZIP��Ŀ
			}
			fis.close();
		}
	}

	public static void main(String[] args) {
		String zipFileName = "hello.zip";
		String sourcePath = "hello";
		MyZip ziper = new MyZip();
		try {
			File sourceFile = new File(sourcePath);
			if(!sourceFile.exists()) {
				sourceFile.mkdir();
				File hello1File = new File(sourcePath + "/hello1.txt");
				hello1File.createNewFile();
				BufferedWriter br1 = new BufferedWriter(
						new FileWriter(hello1File));
				br1.write("��ã��ļ�һ��");
				br1.close();
				File hello2File = new File(sourcePath + "/hello2.txt");
				hello1File.createNewFile();
				BufferedWriter br2 = new BufferedWriter(
						new FileWriter(hello2File));
				br2.write("��ã��ļ�����");
				br2.close();
			}
			//���÷���������Ϊѹ������ļ�����Ҫѹ�����ļ���Ŀ¼����
			ziper.zip(zipFileName, sourceFile);
			System.out.println("ѹ�����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
