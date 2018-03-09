package com.gaga.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.gaga.bean.User;
import com.gaga.utils.HibernateUtils;

public class UserDao {

	public void addMoney(String to, double money) {
		Session session = HibernateUtils.getCurrentSession();
		
		Criteria criteria = session.createCriteria(User.class);
		
		Criteria criteria2 = criteria.add(Restrictions.eq("name", to));
		
		User user = (User) criteria2.uniqueResult();
		
		user.setMoney(user.getMoney()+money);	
		
	}

	public void reduceMoney(String from, double money) {
		Session session = HibernateUtils.getCurrentSession();
		
		User user = (User) session.createCriteria(User.class).add(Restrictions.eq("name", from)).uniqueResult();
		
		user.setMoney(user.getMoney()-money);	
	}

}
