package jdbcAndModel;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;
	public static Connection createConnection() {
		try {
			// load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("before conn");
			//create connection
			String user = "root";
			String pass = "rootroot";
			String url = "jdbc:mysql://localhost:3306/ems";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("afterconn");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
