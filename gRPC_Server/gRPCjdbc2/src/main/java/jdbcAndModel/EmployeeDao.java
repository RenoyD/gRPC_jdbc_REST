package jdbcAndModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
	
	public static boolean insertEmployeeToDB(Employee emp) {
		boolean result = false;
		try {	
		Connection conn = CP.createConnection();
		String query = "INSERT INTO employees(email, first_name, last_name) values (?,?,?)";
		
		//PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		//set the value of parameter
		pstmt.setString(1, emp.getEmail());
		pstmt.setString(2, emp.getFirstName());
		pstmt.setString(3, emp.getLastName());
		
		// execute
		pstmt.executeUpdate();
		result = true;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	public static boolean deleteEmployeeFromDB(int id) {
		boolean result = false;
		try {
		Connection conn = CP.createConnection();
		String query = "DELETE FROM employees where id = ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt(1, id);
		
		pstmt.executeUpdate();
		result = true;
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	public static ArrayList<Employee> readAllEmployeesFromDB() {
		try {
		Connection conn = CP.createConnection();
		String query = "SELECT * FROM employees";
		
		Statement stmt = conn.createStatement();
		ResultSet set = stmt.executeQuery(query);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		while(set.next()) {
			System.out.println("ID :"+ set.getInt(1));
			System.out.println("Email :"+ set.getString(2));
			System.out.println("FirstName :"+ set.getString(3));
			System.out.println("LastName :"+ set.getString("last_name"));
			System.out.println("--------------------------");
			list.add(new Employee(set.getInt(1),set.getString(2),set.getString(3),set.getString("last_name")));
		}
		return list;
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return new ArrayList<Employee>();
	}

	public static boolean updateEmployeeToDB(Employee emp) {
		boolean result = false;
		try {	
		Connection conn = CP.createConnection();
		String query = "UPDATE employees SET email = ? , first_name = ? , last_name = ? WHERE id = ?";
		
		//PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		//set the value of parameter
		pstmt.setString(1, emp.getEmail());
		pstmt.setString(2, emp.getFirstName());
		pstmt.setString(3, emp.getLastName());
		pstmt.setInt(4, emp.getEid());
		
		// execute
		pstmt.executeUpdate();
		result = true;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
