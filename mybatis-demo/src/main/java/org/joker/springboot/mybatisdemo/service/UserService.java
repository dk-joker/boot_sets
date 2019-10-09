package org.joker.springboot.mybatisdemo.service;

import org.joker.springboot.mybatisdemo.dao.UserDao;
import org.joker.springboot.mybatisdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-09 13:46
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

    /**
     * 查找所有用户
     */
    public List<User> selectAllUser() {
        return userDao.findAllUser();
    }

    /**
     * 插入用户
     */
    public void insertService(User user) {
        userDao.insertUser(user.getName(), user.getAge(), user.getMoney());
    }

    /**
     * 根据id 删除用户
     */

    public void deleteService(int id) {
        userDao.deleteUser(id);
    }

    /**
     * 模拟事务。由于加上了 @Transactional注解，如果转账中途出了意外 SnailClimb 和 Daisy 的钱都不会改变。
     */
    @Transactional
    public void changemoney() {
        userDao.updateUser("dk", 22, 200.0, 3);
        // 模拟转账过程中可能遇到的意外状况
        int temp = 1 / 0;
        userDao.updateUser("joker", 18, 400.0, 4);
    }
}

