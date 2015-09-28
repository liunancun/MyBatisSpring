package com.lnc.mybatis.dao;

import com.lnc.mybatis.bean.UserBean;

public interface UserDao {

	UserBean findUserById(String id) throws Exception;

}
