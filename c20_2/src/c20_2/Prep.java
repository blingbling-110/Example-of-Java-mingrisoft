package c20_2;

import java.sql.*;

public class Prep {
	static Connection con;
	static PreparedStatement preSta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			//ʵ����Ԥ�������
			preSta= con.prepareStatement(
					"select * from websites where id = ?");
			preSta.setInt(1, 3);					//���ò���
			res = preSta.executeQuery();		//ִ��Ԥ�������
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
