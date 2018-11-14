package com.sy.product.service.impl;

import com.sy.product.dto.UserInfo;
import com.sy.product.mapper.UserMapper;
import com.sy.product.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(UserInfo userInfo) {
        return userMapper.insertUser(userInfo);
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return userMapper.updateUser(userInfo);
    }

    @Override
    public List<UserInfo> selectUser(UserInfo userInfo) {
        return userMapper.selectUser(userInfo);
    }

    @Override
    public int deleteUser(UserInfo userInfo) {
        return userMapper.deleteUser(userInfo);
    }
}
