package com.sy.product.mapper;

import com.sy.product.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {


    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    List<UserInfo> selectUserById (UserInfo userInfo);

    List<UserInfo> selectUserByName (UserInfo userInfo);

    List<UserInfo> selectUserBySex (UserInfo userInfo);

    int deleteUserByName (UserInfo userInfo);

    int deleteUserById (UserInfo userInfo);
}
