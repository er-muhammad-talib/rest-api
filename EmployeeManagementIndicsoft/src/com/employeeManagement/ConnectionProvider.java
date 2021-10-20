package com.employeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;

	public static Connection createCon() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/employee_manage";
			String name = "khan";
			String pass = "Root@123";

			con = DriverManager.getConnection(url, name, pass);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return con;
	}

}
