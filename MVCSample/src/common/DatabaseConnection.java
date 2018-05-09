package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
	private static String db="ltm";
	private static String url="jdbc:mysql://localhost:3306/"+db+"?useUnicode=true&characterEncoding=UTF-8";
	private static String user ="root";
	private static String password ="";
	private static Connection connection=null;
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return connection;
	}
	public static void main(String[] args) {
		try {
			System.out.println(getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
