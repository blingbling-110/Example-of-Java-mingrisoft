package c20_2;

import java.sql.*;

public class Renewal {
	static Connection con;
	static PreparedStatement preSta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			//��ѯ����
			System.out.println("ִ�����ӡ����ġ�ɾ��֮ǰ��");
			preSta = con.prepareStatement(
					"select * from websites");
			res = preSta.executeQuery();
			MySQL.printRes(res, 5);
			//��������
			preSta = con.prepareStatement(
					"insert into websites "
					+ "values(?, ?, ?, ?, ?)");
			preSta.setInt(1, 6);
			preSta.setString(2, "�ٶ�");
			preSta.setString(3, "https://www.baidu.com/");
			preSta.setString(4, "4");
			preSta.setString(5, "CN");
			preSta.executeUpdate();		//������Ӱ�������
			//��������
			preSta = con.prepareStatement(
					"update websites set alexa = ? "
					+ "where id = ?");
			preSta.setInt(1, 12);
			preSta.setInt(2, 2);
			preSta.executeUpdate();
			//ɾ������
			preSta = con.prepareStatement(
					"delete from websites where id = ?");
			preSta.setInt(1, 5);
			preSta.executeUpdate();
			//��ѯ����
			System.out.println("ִ�����ӡ����ġ�ɾ��֮��");
			preSta = con.prepareStatement(
					"select * from websites");
			res = preSta.executeQuery();
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
