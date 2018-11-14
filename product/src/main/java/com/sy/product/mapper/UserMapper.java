package com.sy.product.mapper;

import com.sy.product.dto.UserInfo;

import java.util.List;

public interface UserMapper {


    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    List<UserInfo> selectUser(UserInfo userInfo);

    int deleteUser(UserInfo userInfo);
}
