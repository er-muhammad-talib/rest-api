package doubltsolvingpractics;

import java.sql.*;
import java.sql.DriverManager;

public class JDBCConnection {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/data";
			String name = "khan";
			String password = "Root@123";
			
			Connection con=DriverManager.getConnection(url,name,password);
			
		
			String q = "create table api_data(id int(10) primary key auto_increment, name varchar(100) not null , city varchar(200))";
			
			Statement st = con.createStatement();
			
			st.executeUpdate(q);
			
			System.out.println("create table succesfully");
			
			con.close();
					
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("error");
		}

	}

}
