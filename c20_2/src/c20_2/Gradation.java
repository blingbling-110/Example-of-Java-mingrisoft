package c20_2;

import java.sql.*;

public class Gradation {
	static Connection con;
	static Statement sta;
	static ResultSet res;
	
	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			sta = con.createStatement();		//ʵ����Statement����
			//ִ��SQL��䣬���ؽ����
			res = sta.executeQuery("select * from websites");
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
