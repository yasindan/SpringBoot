package com.sy.product.mapper;

import com.sy.product.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {


    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    List<UserInfo> selectUser(UserInfo userInfo);

    int deleteUser(UserInfo userInfo);
}
