package com.lnc.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lnc.mybatis.bean.UserBean;
import com.lnc.mybatis.dao.UserDao;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public UserBean findUserById(String id) throws Exception {

		SqlSession sqlSession = this.getSqlSession();

		UserBean user = sqlSession.selectOne("test.findUserById", id);

		return user;
	}

}
