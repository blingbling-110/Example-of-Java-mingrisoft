package c20_2;

import java.sql.*;

public class DeletePart {
	static Connection con;
	static PreparedStatement preSta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			preSta = con.prepareStatement(
					"delete from websites "
					+ "where alexa > 1000");
			preSta.executeUpdate();
			preSta = con.prepareStatement(
					"select * from websites");
			res = preSta.executeQuery();
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(res != null)
					res.close();
				if(preSta != null)
					preSta.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
