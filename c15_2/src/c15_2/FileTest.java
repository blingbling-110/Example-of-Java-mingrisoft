package c15_2;

import java.io.*;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "D:/wallpaper20180818.jpg";
		File file = new File(filePath);
		if(file.exists()) {									//判断对象是否存在
			String name = file.getName();					//获取对象名称
			boolean readable = file.canRead();				//对象是否可读
			boolean writeable = file.canWrite();			//对象是否可写
			long length = file.length();					//获取对象长度（单位：字节）
			String absPath = file.getAbsolutePath();		//获取对象绝对路径
			String parPath = file.getParent();				//获取对象父路径
			boolean isFile = file.isFile();					//判断对象是否为文件
			boolean isDir = file.isDirectory();				//判断对象是否为目录
			boolean isHidden = file.isHidden();				//判断对象是否为隐藏文件
			long modTime = file.lastModified();				//获取对象最后修改时间
			System.out.println("对象名称：" + name);
			System.out.println("对象可读？" + readable);
			System.out.println("对象可写？" + writeable);
			System.out.println("对象长度：" + length);
			System.out.println("对象绝对路径：" + absPath);
			System.out.println("对象父路径：" + parPath);
			System.out.println("对象是否为文件？" + isFile);
			System.out.println("对象是否为目录？" + isDir);
			System.out.println("对象是否为隐藏文件？" + isHidden);
			System.out.println("对象最后修改时间：" +
			String.format("%tc", new Date(modTime)));
			file.delete();
		}else {
			System.out.println("该对象不存在");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
