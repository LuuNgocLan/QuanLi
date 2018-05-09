package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.User;
import model.dao.UserDao;

public class UserBO {
	UserDao userDao = new UserDao();

	public User isValidUser(String username, String password) throws Exception {
		return userDao.isExistUser(username, password);
	}

	public ArrayList<User> getItems() throws SQLException {
		return userDao.getItems();
	}

	public User getItem(String id) throws SQLException {
		return userDao.getItem(id);

	}
	
	public int editItem(String id, String firstname, String lastname) throws SQLException {
		return userDao.editItem(id, firstname,lastname);
	}
	 
	public int delItem(String id) throws SQLException{
		return userDao.delItem(id);
	}
	
	public int addItem(String username, String password, String firstname, String lastname, String idRole) throws SQLException{
		return userDao.addItem(username,password,  firstname,lastname, idRole);
	}
	
	public int updatePass(String id, String password) throws SQLException{
		return userDao.updatePassword(id, password);
	}

}