package com.sy.product.service.impl;

import com.sy.product.dto.UserInfo;
import com.sy.product.mapper.UserMapper;
import com.sy.product.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUser(UserInfo userInfo) {
        return userMapper.insertUser(userInfo);
    }

    @Override
    public Integer updateUser(UserInfo userInfo) {
        return userMapper.updateUser(userInfo);
    }

    @Override
    public List<UserInfo> selectUserById(UserInfo userInfo) {
        return userMapper.selectUserById(userInfo);
    }

    @Override
    public List<UserInfo> selectUserByName(UserInfo userInfo) {
        return userMapper.selectUserByName(userInfo);
    }

    @Override
    public List<UserInfo> selectUserBySex(UserInfo userInfo) {
        return userMapper.selectUserBySex(userInfo);
    }

    @Override
    public Integer deleteUserById(UserInfo userInfo) {
        return userMapper.deleteUserById(userInfo);
    }

    @Override
    public Integer deleteUserByName(UserInfo userInfo) {
        return userMapper.deleteUserByName(userInfo);
    }
}
