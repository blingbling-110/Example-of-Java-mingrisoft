package c15_8;

import java.io.*;
import java.util.zip.*;

public class Decompressing {

	public static void main(String[] args) {
		String zipPath = "../c15_7/hello.zip";
		File zipfile = new File(zipPath);
		try {
			ZipFile zipZip = new ZipFile(zipfile);		//创建压缩文件对象
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipfile));		//创建ZipInputStream对象
			ZipEntry entry = null;						//跳过根目录，获取下一个ZipEntry
			while(((entry = zis.getNextEntry()) != null)
					&& !entry.isDirectory()) {			//如果entry不为空，并不在同一目录下
				File decFile = new File("./" + entry.getName());
				if(!decFile.exists()) {
					decFile.getParentFile().mkdir();
					OutputStream os = new FileOutputStream(decFile);
					InputStream is = zipZip.getInputStream(entry);
					int tmpByte = 0;						//创建临时变量
					while((tmpByte = is.read()) != -1) {
						os.write(tmpByte);
					}
					os.close();
					is.close();
				}
				zis.closeEntry();
				System.out.println(entry.getName() + "压缩完成");
			}
			zis.close();
			zipZip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
