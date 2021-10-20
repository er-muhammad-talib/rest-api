package com.user;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");

		out.println(name);
		out.println(email);
		out.println(password);

		try {
//			Thread.sleep(3000);

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/data";
			String dbName = "khan";
			String pass = "Root@123";

			Connection con = DriverManager.getConnection(url, dbName, pass);

			String q = "insert into api_tab(name,email,password) values (?,?,?)";

			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);

			ps.executeUpdate();

			out.println("done...");

		} catch (Exception e) {
			e.printStackTrace();

			out.println("<h2>error...<h2>");
		}

	}

}
