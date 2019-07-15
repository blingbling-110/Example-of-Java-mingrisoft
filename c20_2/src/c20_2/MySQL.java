package c20_2;

import java.sql.*;

public class MySQL {
	public static Connection getConnection(String dataBase) {
		Connection con = null;
		
		try {
			//MySQL 8.0 以上版本JDBC驱动名
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("MySQL数据库驱动加载完成");
		try {
			/*
			 * 	MySQL 8.0 以上版本
			 * 	需要显式关闭SSL连接
			 * 	需要设置时区Asia/Shanghai
			 * 	需要允许客户端从服务器获取公钥
			 */
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/"
					+ dataBase
					+ "?useSSL=false"
					+ "&serverTimezone=Asia/Shanghai"
					+ "&allowPublicKeyRetrieval=true"
					, "root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("MySQL数据库" + dataBase + "连接成功");
		return con;
	}
	
	public static void printRes(ResultSet res, int columns) {
		try {
			//输出数据表中的指定列数
			while(res.next()) {
				for(int i = 1; i <= columns; i++) {
					System.out.print(res.getString(i) + "\t");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
