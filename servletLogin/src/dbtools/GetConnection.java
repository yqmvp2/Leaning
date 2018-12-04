package dbtools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection getConnectionFromJDBC() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/y2";
		String driverName = "com.mysql.jdbc.Driver";
		String username = "root";
		String password = "123456";
		Class.forName(driverName);
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
