package c15_1;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "D:/wallpaper20180818.jpg";
		File file = new File(filePath);		//创建文件对象
		if(file.exists()) {					//判断文件是否存在
			file.delete();					//删除文件
			System.out.println("文件已删除");
		}else {
			try {
				file.createNewFile();		//创建新文件
				System.out.println("文件已创建");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}

}
