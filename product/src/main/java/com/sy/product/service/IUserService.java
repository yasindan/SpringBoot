package com.sy.product.service;

import com.sy.product.dto.UserInfo;

import java.util.List;

public interface IUserService {

    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    List<UserInfo> selectUser(UserInfo userInfo);

    int deleteUser(UserInfo userInfo);
}
