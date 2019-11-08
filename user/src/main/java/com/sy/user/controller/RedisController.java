package com.sy.user.controller;

import com.sy.user.dto.User;
import com.sy.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("rest_redis")
public class RedisController {
    @Resource
    private UserService userService;

    @GetMapping("/set/")
    public void set() {
        userService.set("key1", new User(1, "sy", 26));
    }

    @RequestMapping(value = {"/setKey"}, method = RequestMethod.POST)
    @ResponseBody
    public void setKey(@RequestBody String key, @RequestBody User user) {
        userService.set(key, user);
    }

    @GetMapping("get")
    public String get() {
        return userService.get("key1").getName();
    }

    @GetMapping("stringset")
    public void stringset() {
        userService.setCode("stringkey", "guoxiaoxi");
    }


    @RequestMapping(value = {"/setKey/{key}/{value}"}, method = RequestMethod.GET)
    @ResponseBody
    public void stringsetKey(@PathVariable String key, @PathVariable String value) {
        userService.setCode(key, value);
    }

    @GetMapping("stringget")
    public String stringget() {
        return userService.getCode("stringkey");
    }
}
