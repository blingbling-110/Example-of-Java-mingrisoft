package c15_8;

import java.io.*;
import java.util.zip.*;

public class Decompressing {
	public static void main(String[] args) {
		File zipFile = new File("../c15_7/hello.zip");
		try {
			ZipFile zipZip = new ZipFile(zipFile);			//����ѹ���ļ�����
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipFile));			//����ZipInputStream����
			ZipEntry entry = null;							//������Ŀ¼����ȡ��һ��ZipEntry
			while(((entry = zis.getNextEntry()) != null)
					&& !entry.isDirectory()) {				//���entry��Ϊ�գ�������ͬһĿ¼��
				//��ѹ�����ļ�·��
				File decFile = new File("./" + entry.getName());
				if(!decFile.exists()) {
					decFile.getParentFile().mkdir();		//�����ļ������ļ���·��
					OutputStream os = new FileOutputStream(decFile);
					//����������ȡѹ���ļ���ָ��Ŀ¼�е��ļ�
					InputStream is = zipZip.getInputStream(entry);
					int tmpByte = 0;						//������ʱ����
					while((tmpByte = is.read()) != -1) {
						os.write(tmpByte);
					}
					os.close();
					is.close();
				}
				zis.closeEntry();
				System.out.println(entry.getName() + "��ѹ�ɹ�");
			}
			zis.close();
			zipZip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
