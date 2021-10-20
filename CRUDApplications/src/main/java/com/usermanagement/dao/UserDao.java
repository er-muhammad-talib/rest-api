package com.usermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.usermanagement.model.User;

public class UserDao {

	private String url = "jdbc:mysql://localhost:3306/indicsoft_data";
	private String name = "khan";
	private String password = "Root@123";

	private static final String insertData = "insert into indicsoft(name , email, addres , contact) valuses(?,?,?,?)";

	private static final String selectUserById = "select id , name , email , addres , contact from indicsoft where id=?";

	private static final String selectAllEmp = "select * from indicsoft";

	private static final String deleteUser = "delete from indicsoft where id=?";

	private static final String updateUser = "update indicsoft set name=? ,email=?,addres=?,contact=? where id=?";

	
	//connection
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, name, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	//insertUser
	public void insertUser(User user) {

		try {

			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(insertData);

			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getAddres());
			ps.setString(4, user.getContact());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//updateUser
	public boolean updateUser(User user) {

		boolean rowUpdated;
		try {

			Connection con = getConnection();
			PreparedStatement psu = con.prepareStatement(updateUser);

			psu.setString(1, user.getName());
			psu.setString(2, user.getEmail());
			psu.setString(3, user.getAddres());
			psu.setString(4, user.getContact());

			psu.setInt(5, user.getId());

			psu.executeUpdate();

			rowUpdated = psu.executeUpdate() > 0;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return true;
	}

	//selectUserById
	public User selectUser(int id) {
		User user = null;

		try {

			Connection con = getConnection();
			PreparedStatement pss = con.prepareStatement(selectUserById);
			pss.setInt(1, id);
			System.out.println(pss);

			ResultSet rs = pss.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String addres = rs.getString("addres");
				String contact = rs.getString("contact");
				user = new User(id, name, email, addres, contact);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	//SelectAllUser
	public List<User> selectAllUsers() {

		List<User> users = new ArrayList<>();

		try {

			Connection con = getConnection();
			PreparedStatement psas = con.prepareStatement(selectUserById);

			System.out.println(psas);

			ResultSet rs = psas.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String addres = rs.getString("addres");
				String contact = rs.getString("contact");
				users.add(new User(id, name, email, addres, contact));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;

	}

	//deleteUser
	public boolean deleteUser(int id) {
		boolean rowDelete;

		try {

			Connection con = getConnection();
			PreparedStatement psd = con.prepareStatement(deleteUser);

			psd.setInt(1, id);
			rowDelete = psd.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}
}
