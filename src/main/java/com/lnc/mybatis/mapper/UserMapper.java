package com.lnc.mybatis.mapper;

import com.lnc.mybatis.bean.UserBean;

public interface UserMapper {

	UserBean findUserById(String id) throws Exception;

}
