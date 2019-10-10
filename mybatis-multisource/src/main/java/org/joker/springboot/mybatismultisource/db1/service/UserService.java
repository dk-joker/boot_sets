package org.joker.springboot.mybatismultisource.db1.service;

import org.joker.springboot.mybatismultisource.db1.dao.UserDao;
import org.joker.springboot.mybatismultisource.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-09 20:02
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据名字查找用户
     */
    public User selectUserByName(String name) {
        return userDao.findUserByName(name);
    }
}

