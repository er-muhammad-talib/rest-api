package com.employeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {

	public static boolean insertEmployeeDB(EmployeeImp emp) {

		boolean f = false;
		try {
			Connection con = ConnectionProvider.createCon();

			String q = "insert into employees( ename , ephone, eadders) values(?,?,?) ";

			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getEmpPhone());
			ps.setString(3, emp.getEmpAdders());

			ps.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return f;
	}

	public static boolean deleteEmployee(int userId) {

		boolean f = false;
		try {
			Connection con = ConnectionProvider.createCon();

			String q = "delete from employees where eid=?";

			PreparedStatement ps = con.prepareStatement(q);

			ps.setInt(1, userId);

			ps.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return f;

	}
	
	
	

	public static void showAllData() {

		try {
			Connection con = ConnectionProvider.createCon();

			String q = "select * from employees;";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(q);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String adders = rs.getString(4);

				System.out.println("Id : " + id);
				System.out.println("Name : " + name);
				System.out.println("PhoneNumber : " + phone);
				System.out.println("Adderss : " + adders);

				System.out.println("---------------------------");

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	

	public static boolean updateData(EmployeeImp emp1, int uId) {

		boolean f = false;
		try {

			Connection con = ConnectionProvider.createCon();

			String q = "update employees set ename=?, ephone=?,eadders=?  where eid = ? ";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, emp1.getEmpName());
			pstmt.setString(2, emp1.getEmpPhone());
			pstmt.setString(3, emp1.getEmpAdders());
			pstmt.setInt(4, uId);

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

}
