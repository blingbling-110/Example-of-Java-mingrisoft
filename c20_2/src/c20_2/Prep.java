package c20_2;

import java.sql.*;

public class Prep {
	static Connection con;
	static PreparedStatement preSta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			//实例化预处理对象
			preSta= con.prepareStatement(
					"select * from websites where id = ?");
			preSta.setInt(1, 3);					//设置参数
			res = preSta.executeQuery();		//执行预处理语句
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
