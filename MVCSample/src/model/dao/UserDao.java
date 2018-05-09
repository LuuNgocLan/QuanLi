package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.DatabaseConnection;
import model.bean.User;

public class UserDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public User isExistUser(String username, String password) {
		User user = null;
		String sql = "SELECT * FROM user WHERE username=? and password=?";
		try {
			conn = DatabaseConnection.getConnection();

			pst = conn.prepareStatement(sql);

			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
						rs.getString("firstname"), rs.getString("lastname"), rs.getInt("id_role"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public ArrayList<User> getItems() {
		ArrayList<User> al = new ArrayList<>();
		String sql = "SELECT * FROM user";
		
		try {
			conn = DatabaseConnection.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
						rs.getString("firstname"), rs.getString("lastname"), rs.getInt("id_role"));
				al.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return al;
	}

	public User getItem(String id) throws SQLException {
		User user = null;
		String sql = "SELECT * FROM user WHERE id =?";
		conn = DatabaseConnection.getConnection();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			while (rs.next()) {
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
						rs.getString("firstname"), rs.getString("lastname"), rs.getInt("id_role"));

			}

		} finally {
			if (rs != null && pst != null && conn != null) {
				rs.close();
				pst.close();
				conn.close();
			}
		}
		return user;
	}
	
	public int addItem(String username,String password, String firstname, String lastname, String idRole) throws SQLException {
		int result=0;
		String sql ="INSERT INTO user(username,password,firstname,lastname,id_role) VALUES(?,?,?,?,?)";
		conn = DatabaseConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2,password);
			pst.setString(3, firstname);
			pst.setString(4, lastname);
			pst.setString(5, idRole);
			result = pst.executeUpdate();
			
		}  finally {
			if (pst != null && conn != null) {
				pst.close();
				conn.close();

			}
		}
		return result;
	}
	
	public int editItem(String id, String firstname, String lastname) throws SQLException {
		int result=0;
		String sql ="UPDATE user SET firstname=?, lastname=? WHERE id =?";
		conn = DatabaseConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, firstname);
			pst.setString(2, lastname);
			pst.setString(3, id);
			result = pst.executeUpdate();
			
		}  finally {
			if (pst != null && conn != null) {
				pst.close();
				conn.close();

			}
		}
		return result;
	}

	public int delItem(String id) throws SQLException {
		int result=0;
		String sql = "DELETE FROM user WHERE id=?";
		conn = DatabaseConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);

			result = pst.executeUpdate();

		} finally {
			if (pst != null && conn != null) {
				pst.close();
				conn.close();
			}
		}
		return result;
	}

	public int updatePassword( String id,String password) throws SQLException {
		int result=0;
		String sql ="UPDATE user SET password=? WHERE id =?";
		conn = DatabaseConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, password);
			pst.setString(2, id);
			result = pst.executeUpdate();
			
		}  finally {
			if (pst != null && conn != null) {
				pst.close();
				conn.close();

			}
		}
		return result;
	}



}
