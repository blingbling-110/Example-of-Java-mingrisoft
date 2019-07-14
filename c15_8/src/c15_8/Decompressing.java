package c15_8;

import java.io.*;
import java.util.zip.*;

public class Decompressing {

	public static void main(String[] args) {
		String zipPath = "../c15_7/hello.zip";
		File zipfile = new File(zipPath);
		try {
			ZipFile zipZip = new ZipFile(zipfile);		//����ѹ���ļ�����
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipfile));		//����ZipInputStream����
			ZipEntry entry = null;						//������Ŀ¼����ȡ��һ��ZipEntry
			while(((entry = zis.getNextEntry()) != null)
					&& !entry.isDirectory()) {			//���entry��Ϊ�գ�������ͬһĿ¼��
				File decFile = new File("./" + entry.getName());
				if(!decFile.exists()) {
					decFile.getParentFile().mkdir();
					OutputStream os = new FileOutputStream(decFile);
					InputStream is = zipZip.getInputStream(entry);
					int tmpByte = 0;						//������ʱ����
					while((tmpByte = is.read()) != -1) {
						os.write(tmpByte);
					}
					os.close();
					is.close();
				}
				zis.closeEntry();
				System.out.println(entry.getName() + "ѹ�����");
			}
			zis.close();
			zipZip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
