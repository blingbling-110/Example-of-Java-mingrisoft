package c20_2;

import java.sql.*;

public class MySQL {
	public static Connection getConnection(String dataBase) {
		Connection con = null;
		
		try {
			//MySQL 8.0 ���ϰ汾JDBC������
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("MySQL���ݿ������������");
		try {
			/*
			 * 	MySQL 8.0 ���ϰ汾
			 * 	��Ҫ��ʽ�ر�SSL����
			 * 	��Ҫ����ʱ��Asia/Shanghai
			 * 	��Ҫ����ͻ��˴ӷ�������ȡ��Կ
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
		System.out.println("MySQL���ݿ�" + dataBase + "���ӳɹ�");
		return con;
	}
	
	public static void printRes(ResultSet res, int columns) {
		try {
			//������ݱ��е�ָ������
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
