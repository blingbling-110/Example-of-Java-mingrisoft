package c20_2;

import java.sql.*;

public class Renewal {
	static Connection con;
	static PreparedStatement preSta;
	static ResultSet res;

	public static void main(String[] args) {
		con = MySQL.getConnection("runoob");
		try {
			//查询数据
			System.out.println("执行增加、更改、删除之前：");
			preSta = con.prepareStatement(
					"select * from websites");
			res = preSta.executeQuery();
			MySQL.printRes(res, 5);
			//增加数据
			preSta = con.prepareStatement(
					"insert into websites "
					+ "values(?, ?, ?, ?, ?)");
			preSta.setInt(1, 6);
			preSta.setString(2, "百度");
			preSta.setString(3, "https://www.baidu.com/");
			preSta.setString(4, "4");
			preSta.setString(5, "CN");
			preSta.executeUpdate();		//返回所影响的行数
			//更改数据
			preSta = con.prepareStatement(
					"update websites set alexa = ? "
					+ "where id = ?");
			preSta.setInt(1, 12);
			preSta.setInt(2, 2);
			preSta.executeUpdate();
			//删除数据
			preSta = con.prepareStatement(
					"delete from websites where id = ?");
			preSta.setInt(1, 5);
			preSta.executeUpdate();
			//查询数据
			System.out.println("执行增加、更改、删除之后：");
			preSta = con.prepareStatement(
					"select * from websites");
			res = preSta.executeQuery();
			MySQL.printRes(res, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
