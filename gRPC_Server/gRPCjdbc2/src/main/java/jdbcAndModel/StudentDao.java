package jdbcAndModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		boolean result = false;
		try {	
		System.out.println("before conn");
		Connection conn = CP.createConnection();
		System.out.println("after conn");
		String query = "INSERT INTO students(s_name, s_phone, s_city) values (?,?,?)";
		
		//PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		//set the value of parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		// execute
		pstmt.executeUpdate();
		result = true;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	public static boolean deleteStudentFromDB(int id) {
		boolean result = false;
		try {
		Connection conn = CP.createConnection();
		String query = "DELETE FROM students where sid = ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt(1, id);
		
		pstmt.executeUpdate();
		result = true;
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	public static ArrayList<Student> readAllStudentsFromDB() {
		try {
		Connection conn = CP.createConnection();
		String query = "SELECT * FROM students";
		
		Statement stmt = conn.createStatement();
		ResultSet set = stmt.executeQuery(query);
		ArrayList<Student> list = new ArrayList<Student>();
		while(set.next()) {
			System.out.println("ID :"+ set.getInt(1));
			System.out.println("Name :"+ set.getString(2));
			System.out.println("Phone :"+ set.getString(3));
			System.out.println("City :"+ set.getString("s_city"));
			System.out.println("--------------------------");
			list.add(new Student(set.getInt(1),set.getString(2),set.getString(3),set.getString("s_city")));
			
		}
		return list;
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Student>();
	}

	public static boolean updateStudentToDB(Student st) {
		boolean result = false;
		try {	
		Connection conn = CP.createConnection();
		String query = "UPDATE students SET s_name = ? , s_phone = ? , s_city = ? WHERE sid = ?";
		
		//PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		//set the value of parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		pstmt.setInt(4, st.getStudentId());
		
		// execute
		pstmt.executeUpdate();
		result = true;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
