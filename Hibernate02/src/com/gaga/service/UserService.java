package com.gaga.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaga.dao.UserDao;
import com.gaga.utils.HibernateUtils;

public class UserService {

	public boolean transfer(String to, String from, double money) {
		try {
			UserDao userDao = new UserDao();

			Session session = HibernateUtils.getCurrentSession();
			// 开启事务
			Transaction transaction = session.beginTransaction();
			// 处理事务
			userDao.addMoney(to, money);
			userDao.reduceMoney(from, money);
			// 提交事务

			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
