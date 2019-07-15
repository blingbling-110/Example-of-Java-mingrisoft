package c20_2;

import java.sql.*;

public class Train {
	static Connection con;
	static Statement sta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			sta = con.createStatement();
			res = sta.executeQuery(
					"select * from websites"
					+ " where url like 'https%'");
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
