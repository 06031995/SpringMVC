package com.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserDao.UserDao;
import com.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int saveData(User user){
		return userDao.saveData(user);
	}

}
