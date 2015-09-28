package com.lnc.mybatis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnc.mybatis.bean.UserBean;
import com.lnc.mybatis.dao.UserDao;

public class DaoMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");

		UserDao userDao = context.getBean(UserDao.class);

		UserBean user = userDao.findUserById("002");

		System.out.println(user);

		context.close();
	}

}
