package com.legatohealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.beans.User;
import com.legatohealth.dao.UserDao;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; // injects the UserDao implementation object
	@Override
	public void storeUser(User user) {
		userDao.store(user);
	}

	@Override
	public User findUser(int userId) {
		
		return userDao.fetchUser(userId);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.fetchUsers();
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);

	}
	@Override
	public void updateUser(int userId, User user)
	{
		userDao.updateUser(userId, user);
	}
	
	@Override
	public void updateName(int userId, String name) {
		userDao.updateName(userId, name);

	}

	@Override
	public void updatePassword(int userId, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAge(int userId, int age) {
		// TODO Auto-generated method stub

	}

}
