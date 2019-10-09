package org.joker.springboot.mybatisdemo.controller;

import org.joker.springboot.mybatisdemo.entity.User;
import org.joker.springboot.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-09 13:45
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query/{name}")
    public User testQuery(@PathVariable String name) {
        return userService.selectUserByName(name);
    }

    @RequestMapping("/insert")
    public List<User> testInsert(@RequestBody User user) {
        userService.insertService(user);
        return userService.selectAllUser();
    }

    @RequestMapping("/changemoney")
    public List<User> testchangemoney() {
        userService.changemoney();
        return userService.selectAllUser();
    }

    @RequestMapping("/delete/{id}")
    public String testDelete(@PathVariable int id) {
        userService.deleteService(id);
        return "OK";
    }

}

