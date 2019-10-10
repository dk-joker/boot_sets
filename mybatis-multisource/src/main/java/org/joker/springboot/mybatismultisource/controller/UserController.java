package org.joker.springboot.mybatismultisource.controller;

import org.joker.springboot.mybatismultisource.db1.service.UserService;
import org.joker.springboot.mybatismultisource.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-10 13:32
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
}

