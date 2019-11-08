package com.sy.product.service;

import com.sy.product.dto.UserInfo;

import java.util.List;

public interface IUserService {

    Integer insertUser(UserInfo userInfo);

    Integer updateUser(UserInfo userInfo);

    List<UserInfo> selectUserById(UserInfo userInfo);

    List<UserInfo> selectUserByName(UserInfo userInfo);

    List<UserInfo> selectUserBySex(UserInfo userInfo);

    Integer deleteUserByName(UserInfo userInfo);

    Integer deleteUserById(UserInfo userInfo);

}
