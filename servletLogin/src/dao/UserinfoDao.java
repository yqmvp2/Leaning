package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbtools.GetConnection;
import entity.Userinfo;

public class UserinfoDao {
	public Userinfo findUserinfo(String username, String password) throws ClassNotFoundException, SQLException {
		Userinfo  userinfo = null;
		String sql = "select * from userinfo where username=? and password=?";
		Connection connection = GetConnection.getConnectionFromJDBC();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int iddb = resultSet.getInt("id");
			String usernamedb = resultSet.getString("username");
			String passworddb = resultSet.getString("password");
			userinfo = new Userinfo();
			userinfo.setId(iddb);
			userinfo.setUsername(usernamedb);
			userinfo.setPassword(passworddb);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return userinfo;
	}
}
