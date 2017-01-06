package com.feyshine.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.feyshine.pojo.User;
import com.feyshine.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
	    Session session =   HibernateUtil.getSessionFactory().openSession();//从会话工厂获取一个session
	    Transaction transaction = session.beginTransaction();//开启一个新的事务
	    User user = new User();
	    user.setId(2);
	    user.setUsername("zengh");
	    session.save(user);
	    transaction.commit();//提交事务

	}

}
