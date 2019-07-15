package c15_3;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "C:/Users/qinzijun/Desktop/FileTest.txt";
		File file = new File(filePath);
		
		try {
			//创建FileOutputStream类对象
			FileOutputStream out = new FileOutputStream(file);
			//创建byte型数组
			byte[] outContent = "我有一只小毛驴，我从来也不骑。".getBytes();
			out.write(outContent);
			out.close();		//关闭流
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			//创建FileInputStream类对象
			FileInputStream in = new FileInputStream(file);
			byte[] inContent = new byte[1024];		//创建byte型数组
			int length = in.read(inContent);		//从文件中读取信息
			System.out.println("文件中的信息是：\n" + new String(inContent, 0, length));
			in.close();		//关闭流
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
