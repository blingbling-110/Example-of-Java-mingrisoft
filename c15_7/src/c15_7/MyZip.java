package c15_7;

import java.io.*;
import java.util.zip.*;

public class MyZip {

	private void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(
				zipFileName));			//创建ZipOutputStream对象
		zip(zos, inputFile, "");
		System.out.println("压缩中……");
		zos.close();
	}
	
	private void zip(ZipOutputStream zos, File inputFile, String base
			) throws Exception {								//方法重载
		if(inputFile.isDirectory()) {
			File[] fl = inputFile.listFiles();					//获取路径数组
			if(base.length() != 0) {
				zos.putNextEntry(new ZipEntry(base + "/"));		//写入此目录的entry
			}
			for(int i = 0; i < fl.length; i++) {				//循环遍历数组中的文件
				zip(zos, fl[i], base + fl[i]);
			}
		}else {
			zos.putNextEntry(new ZipEntry(base));				//创建新的进入点
			FileInputStream fis = new FileInputStream(inputFile);
			int b;												//定义int型变量
			System.out.println(base);
			while((b = fis.read()) != -1) {						//未到达流的尾部
				zos.write(b);									//将字节写入当前ZIP条目
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
				br1.write("你好，文件一。");
				br1.close();
				File hello2File = new File(sourcePath + "/hello2.txt");
				hello1File.createNewFile();
				BufferedWriter br2 = new BufferedWriter(
						new FileWriter(hello2File));
				br2.write("你好，文件二。");
				br2.close();
			}
			//调用方法，参数为压缩后的文件名与要压缩的文件夹目录对象
			ziper.zip(zipFileName, sourceFile);
			System.out.println("压缩完成");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
