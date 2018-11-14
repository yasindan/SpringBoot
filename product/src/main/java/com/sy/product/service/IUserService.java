package com.sy.product.service;

import com.sy.product.dto.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUserService {

    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    List<UserInfo> selectUser(UserInfo userInfo);

    int deleteUser(UserInfo userInfo);
}
