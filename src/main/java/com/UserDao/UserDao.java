package com.UserDao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDao {

	@Autowired
	HibernateTemplate hb;
	
	
	public int saveData(User user){
		Integer id = (Integer) this.hb.save(user);
		return id;
	}
}
