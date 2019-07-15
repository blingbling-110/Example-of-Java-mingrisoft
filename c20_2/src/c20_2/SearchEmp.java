package c20_2;

import java.sql.*;

public class SearchEmp {
	static Connection con;
	static PreparedStatement preSta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			preSta = con.prepareStatement(
					"select * from websites "
					+ "where country = ?");
			preSta.setString(1, "cn");
			res = preSta.executeQuery();
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
