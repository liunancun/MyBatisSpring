package com.lnc.mybatis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnc.mybatis.bean.UserBean;
import com.lnc.mybatis.mapper.UserMapper;

public class MapperMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml");

		UserMapper userMapper = context.getBean(UserMapper.class);

		UserBean user = userMapper.findUserById("002");

		System.out.println(user);

		context.close();
	}

}
