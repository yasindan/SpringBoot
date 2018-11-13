package com.sy.user.controller;

import com.sy.user.enums.User;
import com.sy.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("rest_redis")
public class RedisController {
    @Resource
    private UserService userService;
    @GetMapping("set")
    public void set() {
        userService.set("key1", new User(1, "xiaoxi", 26));
    }
    @GetMapping("get")
    public String get() {
        return userService.get("key1").getName();
    }
    @GetMapping("stringset")
    public void stringset() {
        userService.setCode("stringkey", "meepoguan_coke");
    }
    @GetMapping("stringget")
    public String stringget() {
        return userService.getCode("stringkey");
    }
}
