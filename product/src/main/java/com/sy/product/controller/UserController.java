package com.sy.product.controller;

import com.sy.product.dto.UserInfo;
import com.sy.product.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = {"/insert/{name}/{password}/{sex}"}, method = RequestMethod.GET)
    @ResponseBody
    public int insertUser(@PathVariable String name, @PathVariable String password, @PathVariable String sex){
        UserInfo userInfo = new UserInfo(name, sex, password);
        return userService.insertUser(userInfo);
    }

    @RequestMapping(value = {"/update/{id}/{name}/{password}/{sex}"}, method = RequestMethod.GET)
    @ResponseBody
    public int updateUser(@PathVariable long id, @PathVariable String name, @PathVariable String password, @PathVariable String sex){
        UserInfo userInfo = new UserInfo(id, name, sex, password);
        return userService.updateUser(userInfo);
    }

    @RequestMapping(value = {"/select/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> selectUserById(@PathVariable long id){
        UserInfo userInfo = new UserInfo(id);
        return userService.selectUser(userInfo);
    }

    @RequestMapping(value = {"/select/{name}"}, method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> selectUserByName(@PathVariable String name){
        UserInfo userInfo = new UserInfo(name);
        return userService.selectUser(userInfo);
    }

    @RequestMapping(value = {"/select/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public int deleteUserById(@PathVariable long id){
        UserInfo userInfo = new UserInfo(id);
        return userService.deleteUser(userInfo);
    }


    @RequestMapping(value = {"/select/{name}"}, method = RequestMethod.GET)
    @ResponseBody
    public int deleteUserByName(@PathVariable String name){
        UserInfo userInfo = new UserInfo(name);
        return userService.deleteUser(userInfo);
    }
}
