package com.test.server.dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.test.server.dao.UserDAO;
import com.test.server.domain.User;
import com.test.server.exception.CCMSException;

@Repository("userDAO")
public class UserDaoImpl extends GenericDAOImpl<User, Long> implements UserDAO{

	public UserDaoImpl() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public List<User> getUserDetails() throws Exception {
		
		Criteria criteria = getCriteria(User.class);
		@SuppressWarnings("unchecked")
		List<User> userList = criteria.list();
		return userList;
	}



	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		
		Criteria criteria = getCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		return (User) criteria.uniqueResult();
	}



	



	


	

	
}
