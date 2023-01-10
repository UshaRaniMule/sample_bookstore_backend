package com.springbootsample.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootsample.model.Users;
import com.springbootsample.repository.UserRepository;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{

	 @Autowired
	    private SessionFactory sessionFactory;

	    private Session getSession() {
	        return sessionFactory.getCurrentSession();
	    }

	    @SuppressWarnings("unchecked")
	    public List<Users> getAllUsers() {
	        return getSession().createQuery("from Users").list();
	    }

		@Override
		public Boolean userLogin(Users users) {
			// TODO Auto-generated method stub
			Query query =getSession().createQuery("from Users where username=:name");
			query.setParameter("name", users.getUsername());
			
		List<Users> lstUsers =	query.list();
		
		if(lstUsers.size() > 0) {
			Users findUser = lstUsers.get(0);
			if(findUser.getUsername().equalsIgnoreCase(users.getUsername()) 
					&& 
					findUser.getPassword().equals(users.getPassword())) 
			return true;
		}
			return false;
		}
}
