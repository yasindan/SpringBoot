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
    public int updateUser(@PathVariable int id, @PathVariable String name, @PathVariable String password, @PathVariable String sex){
        UserInfo userInfo = new UserInfo(id, name, sex, password);
        return userService.updateUser(userInfo);
    }

    @RequestMapping(value = {"/select/id/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> selectUserById(@PathVariable int id){
        UserInfo userInfo = new UserInfo(id);
        return userService.selectUserById(userInfo);
    }

    @RequestMapping(value = {"/select/name/{name}"}, method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> selectUserByName(@PathVariable String name){
        UserInfo userInfo = new UserInfo(name);
        return userService.selectUserByName(userInfo);
    }

    @RequestMapping(value = {"/select/sex/{sex}"}, method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> selectUserBySex(@PathVariable String name){
        UserInfo userInfo = new UserInfo(name);
        return userService.selectUserBySex(userInfo);
    }

    @RequestMapping(value = {"/delete/id/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public int deleteUserById(@PathVariable int id){
        UserInfo userInfo = new UserInfo(id);
        return userService.deleteUserById(userInfo);
    }

    @RequestMapping(value = {"/delete/name/{name}"}, method = RequestMethod.GET)
    @ResponseBody
    public int deleteUserByName(@PathVariable String name){
        UserInfo userInfo = new UserInfo(name);
        return userService.deleteUserByName(userInfo);
    }
}
