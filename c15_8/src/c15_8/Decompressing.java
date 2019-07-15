package c15_8;

import java.io.*;
import java.util.zip.*;

public class Decompressing {
	public static void main(String[] args) {
		File zipFile = new File("../c15_7/hello.zip");
		try {
			ZipFile zipZip = new ZipFile(zipFile);			//创建压缩文件对象
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipFile));			//创建ZipInputStream对象
			ZipEntry entry = null;							//跳过根目录，获取下一个ZipEntry
			while(((entry = zis.getNextEntry()) != null)
					&& !entry.isDirectory()) {				//如果entry不为空，并不在同一目录下
				//解压出的文件路径
				File decFile = new File("./" + entry.getName());
				if(!decFile.exists()) {
					decFile.getParentFile().mkdir();		//创建文件父类文件夹路径
					OutputStream os = new FileOutputStream(decFile);
					//用输入流读取压缩文件中指定目录中的文件
					InputStream is = zipZip.getInputStream(entry);
					int tmpByte = 0;						//创建临时变量
					while((tmpByte = is.read()) != -1) {
						os.write(tmpByte);
					}
					os.close();
					is.close();
				}
				zis.closeEntry();
				System.out.println(entry.getName() + "解压成功");
			}
			zis.close();
			zipZip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
