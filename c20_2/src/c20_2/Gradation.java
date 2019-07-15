package c20_2;

import java.sql.*;

public class Gradation {
	static Connection con;
	static Statement sta;
	static ResultSet res;
	
	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			sta = con.createStatement();		//实例化Statement对象
			//执行SQL语句，返回结果集
			res = sta.executeQuery("select * from websites");
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
