
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employeeManagement.ConnectionProvider;
import com.employeeManagement.EmployeeDao;
import com.employeeManagement.EmployeeImp;

public class Start {

	public static void main(String[] args) throws IOException, SQLException {

		System.out.println("Welcome to  indicsoft employee app ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("\nPress 1 to add employee");
			System.out.println("Press 2 to delete employee");
			System.out.println("Press 3 to display data all employee");
			System.out.println("Press 4 to update data  ");
			System.out.println("Press 5 to exit this app");

			int c = Integer.parseInt(br.readLine());
// this is first operstion
			if (c == 1) {

				System.out.println("Enter employee name :");
				String name = br.readLine();

				System.out.println("Enter employee phone number :");
				String phone = br.readLine();

				System.out.println("Enter employee adders :");
				String adders = br.readLine();

				EmployeeImp emp = new EmployeeImp(name, phone, adders);

				boolean answer = EmployeeDao.insertEmployeeDB(emp);
				if (answer) {
					System.out.println("\nEmployee is added  succesfully...\n");
				} else {
					System.out.println("Something is wrong...");
				}
				System.out.println(emp);
				////////

// this is second method	
			} else if (c == 2) {
				System.out.println("Enter employee id to delete data :");
				int userId = Integer.parseInt(br.readLine());
				boolean f = EmployeeDao.deleteEmployee(userId);
				if (f) {
					System.out.println("\nEmployee data us deleted succesfully... \n");
				} else {
					System.out.println("Something is wrong");
				}

///////////

			} else if (c == 3) {

				EmployeeDao.showAllData();

			}

//////////////			
			if (c == 4) {

				System.out.println("Enter employee name :");
				String name = br.readLine();

				System.out.println("Enter employee phone number :");
				String phone = br.readLine();

				System.out.println("Enter employee adders :");
				String adders = br.readLine();

				System.out.println("Enter employ id :");

				int id = Integer.parseInt(br.readLine());

				EmployeeImp emp1 = new EmployeeImp(name, phone, adders);

				boolean answer = EmployeeDao.updateData(emp1, id);
				if (answer) {
					System.out.println("\nEmployee is added  succesfully...\n");
				} else {
					System.out.println("Something is wrong...");
				}

				System.out.println(emp1);

			} else if (c == 5) {
				break;
			} else {

			}

		}

		System.out.println("\nThanke you for using this app\n");

	}

}
