package com.legatohealth.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.legatohealth.beans.User;
import com.mysql.cj.xdevapi.Result;
@Repository
public class UserDaoJdbcImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbc; // because in the xml a bean is configured for JdbcTemplate we can inject it
	
//	private User UsermapRowToUser(ResultSet resultSet, int rowNum) throws SQLException {
//		return User.Builder().userid(resultSet.getInt("userid")).name(resultSet.getString("name"))
//				.password(resultSet.getString("password")).age(resultSet.getInt("age")).build();
//	}
	@Override
	public void store(User user) {
		String insertQuery = "insert into users (name, password, age) values (?, ?, ?)";
		jdbc.update(insertQuery, user.getName(), user.getPassword(), user.getAge());
	}
	@Override
	public void updateUser(int userId, User user) {
		String updateUserQuery = "update users set name =?, password = ?, age = ? where id = ?";
		jdbc.update(updateUserQuery, user.getName(), user.getPassword(), user.getAge(),userId);
	}
	@Override
	public void updateName(int userId, String name) {
		String updateUserQuery = "update users set name =? where id = ?";
		jdbc.update(updateUserQuery, name, userId);
	}
	@Override
	public void deleteUser(int userId) {
		String deleteQuery = "delete from users where id = ?";
		jdbc.update(deleteQuery, userId);
	}
	@Override
	public User fetchUser(int userId) {
		String selectUserQuery = "select * from users where id = ?";
		/*
		 * queryForObject takes a RowMapper which returns a single user object based on the id
		 * the last argument is the id that maps to the ?
		 */
		User userObtained = jdbc.queryForObject(selectUserQuery, (rs, index) -> {
			User user = new User();
			user.setUserId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setAge(rs.getInt("age"));
			return user;
		}, userId); // userId is the 3rd argment
		return userObtained;
	}
	@Override
	public List<User> fetchUsers() {
		  return jdbc.query("select * from users",new RowMapper<User>(){    
		        public User mapRow(ResultSet rs, int row) throws SQLException {    
		            User u=new User();    
		            u.setUserId(rs.getInt(1));    
		            u.setName(rs.getString(2));    
		            u.setPassword(rs.getString(3));    
		            u.setAge(rs.getInt(4));    
		            return u;    
		        }    
		    });    
		}    
	

}
